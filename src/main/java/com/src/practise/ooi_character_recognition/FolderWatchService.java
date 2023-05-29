package com.src.practise.ooi_character_recognition;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.src.practise.ooi_voice_announcements.VoiceAnnouncements;
import lombok.SneakyThrows;
import org.apache.http.entity.ContentType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.net.URLEncoder;
import java.nio.file.FileSystems;//阻塞式IO流jar包
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 实时监控读取文件夹中文件的变化，并作出动作相应处理
 */

public class FolderWatchService {
    private static String path = "E:\\033_temp";

    public static void getFile() throws FileNotFoundException, IOException {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                WatchKey key;
                try {
                    WatchService watchService = FileSystems.getDefault().newWatchService();
                    Paths.get(path).register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
                    while (true) {
                        File file = new File(path);//path为监听文件夹
                        System.out.println("等待图片加载！");
                        key = watchService.take();//没有文件增加时，阻塞在这里
                        for (WatchEvent<?> event : key.pollEvents()) {
                            /**文件数组如放在for循环外，获得的这是上一次添加的文件
                             *
                             */
                            File[] files = file.listFiles();
                            String fileName = path + "\\" + event.context();
                            System.out.println("最新增加文件的文件夹路径" + fileName);
                            File file1 = files[files.length - 1];//获取最新文件
                            System.out.println(file1.getName());//根据后缀判断
                            /**将File转化为MultipartFile
                             *
                             */
                            FileInputStream fileInputStream = new FileInputStream(file1);
                            MultipartFile multipartFile = new MockMultipartFile(file1.getName(), file1.getName(),
                                    ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
                            /*JSONObject和JSONArray的区别
                             * 1.JSONObject是由{}包裹，JSONArray是由[]包裹的
                             * 2.JSONObject有键名，JSONArray没有
                             * 3.JSONObject解析：JSONObject.getString("msg")，JSONArray解析：JSONArray.getString(5)，其中5是指位置
                             */
                            JSONObject parseObject = null;
                            /**
                             *
                             */
                            String result = "";
                            /**
                             * 百度接口要求文件大小不超过1M
                             */
                            String imgStr = "";
                            /**   图片大小超过4MB
                             *   若超过则进行压缩
                             *   一般不会超过
                             */
                            if (multipartFile.getSize() / 1024 > 4096) {
                                byte[] imgBytes = ImgeUtils.compressPicByQuality(multipartFile.getBytes(), 0.1F);
                                imgStr = Base64Util.encode(imgBytes);
                            } else {
                                imgStr = Base64Util.encode(multipartFile.getBytes());
                            }
                            String imgParam = URLEncoder.encode(imgStr, "UTF-8");
                            String param = "image=" + imgParam;
                            String accessToken = "24.c2afedbb61049f95727699dd53c3a34f.2592000.1603392798.282335-21835341";
                            result = HttpUtil.post("https://aip.baidubce.com/rest/2.0/ocr/v1/accurate_basic", accessToken, param);
                            //JSONArray是数组
                            parseObject = JSONArray.parseObject(result);
                            String wordsResult = parseObject.getString("words_result");
                            /** string与JSONarray之间转化(这里用的是阿里的)
                             */
                            JSONArray jsonArray = JSONArray.parseArray(wordsResult);
                            //构建字符串
                            //todo 备注一场显示
                            /**
                             * 1.传统地，连接字符串，需要创建一个String对象，耗时且浪费时间
                             * 2.利用StringBuilder可以避免这个问题的发生
                             * 3.前身是StringBuffer,效率比较低，允许多线程增删字符串操作
                             * 4.StringBuilder是单线程的
                             */
                            StringBuilder stringBuilder = new StringBuilder();
                            //遍历JSONArray
                            for (int i = 0; i < jsonArray.size(); i++) {
                                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                                stringBuilder.append(jsonObject.get("words"));
                            }
                            String words = stringBuilder.toString();
                            System.out.println(words);
                            //将识别结果去除JSONArray对象，加入JSONObject
                            parseObject.remove("words_result");
                            parseObject.put("words", words);
                            VoiceAnnouncements.read(parseObject.getString("words"));
                        }
                        if (!key.reset()) {
                            break; //中断循环
                        }
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }, 2000, 3000);//第一个数字2000表示，2000ms以后开启定时器,第二个数字3000，表示3000ms后运行一次run
    }

    @SneakyThrows
    public static void main(String[] args) {
        FolderWatchService.getFile();
    }
}