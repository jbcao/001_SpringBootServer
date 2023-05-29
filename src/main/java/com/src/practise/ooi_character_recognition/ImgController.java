package com.src.practise.ooi_character_recognition;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.src.entity.Expiration;
import com.src.service.ExpirationService;
import com.src.util.Constant;
import com.src.util.ServletUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用方式：
 * 1、浏览器请求接口
 * 2、运行psvm方法，读取本地文件
 */
@Slf4j
@RestController
@PropertySource("classpath:application.properties")
public class ImgController {

    /**
     * 1.使用lombok,采用注解简化代码
     * 2.添加@Slf4j注解
     * 3.此时日志对象要用log
     */
//Logger logger =LoggerFactory.getLogger(ImgController.class);
    @Autowired
    private ExpirationService expirationService;
    // 请求url,从配置文件读取
    @Value("${character.identify.url}")
    private String url;

    @ResponseBody
    @RequestMapping(value = "/ocr", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    public void test(@RequestPart(value = "file", required = false) MultipartFile file, HttpServletResponse response,
                     HttpServletRequest request) {
        try {
            //TODO restful 响应处理 日志处理
            Map<String, Object> res = new HashMap<String, Object>();
            JSONObject parseObject = distinguish(file);
            /**
             * 1.HashMap：
             * 最常用的Map，根据键的hashcode值来存储数据，根据键可以直接获得他的值（因为相同的键hashcode值相同，在地址为hashcode值的地方存储的就是值，所以根据键可以直接获得值），具有很快的访问速度，遍历时，取得数据的顺序完全是随机的，HashMap最多只允许一条记录的键为null，允许多条记录的值为null，HashMap不支持线程同步，即任意时刻可以有多个线程同时写HashMap，这样对导致数据不一致，如果需要同步，可以使用synchronziedMap的方法使得HashMap具有同步的能力或者使用concurrentHashMap
             *
             * 2.HashTable：
             * 与HashMap类似，不同的是，它不允许记录的键或值为空，支持线程同步，即任意时刻只能有一个线程写HashTable，因此也导致HashTable在写入时比较慢!
             *
             * 3.LinkedHashMap：
             * 是HahsMap的一个子类，但它保持了记录的插入顺序，遍历时先得到的肯定是先插入的，也可以在构造时带参数，按照应用次数排序，在遍历时会比HahsMap慢，不过有个例外，当HashMap的容量很大，实际数据少时，遍历起来会比LinkedHashMap慢（因为它是链啊），因为HashMap的遍历速度和它容量有关，LinkedHashMap遍历速度只与数据多少有关
             *
             * 4.TreeMap：
             * 实现了sortMap接口，能够把保存的记录按照键排序（默认升序），也可以指定排序比较器，遍历时得到的数据是排过序的
             *
             * 什么情况用什么类型的Map：
             * 在Map中插入，删除，定位元素：   HashMap
             * 要按照自定义顺序或自然顺序遍历：TreeMap
             * 要求输入顺序和输出顺序相同：    LinkedHashMap
             */
            //new对象 ctrl+alt+""
            HashMap map = new HashMap();
            map.put("words", parseObject.get("words_result"));
            System.out.println("曹建邦" + parseObject);
            res.put(Constant.RESPONSE_CODE, 200);
            res.put(Constant.RESPONSE_CODE_MSG, "true");
            res.put(Constant.RESPONSE_DATA, parseObject);
            //跨域问题解决
            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Credentials", "true");
            ServletUtils.writeToResponse(response, res);
            System.out.println(res);
            //read(result);
            log.info("文字识别与播报完成");
        } catch (
                Exception e)

        {
            e.printStackTrace();
        }
    }

    /**
     * 测试文件上传
     */
    @RequestMapping(value = "/testfile", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String fileUpload(@RequestParam("testfile") MultipartFile file) {
        String name = file.getName();
        System.out.println(name);
        return "上传完成";
    }

    /**
     * 图像识别
     *
     * @param file
     * @return
     */
    public JSONObject distinguish(MultipartFile file) {
        /*JSONObject和JSONArray的区别
         * 1.JSONObject是由{}包裹，JSONArray是由[]包裹的
         * 2.JSONObject有键名，JSONArray没有
         * 3.JSONObject解析：JSONObject.getString("msg")，JSONArray解析：JSONArray.getString(5)，其中5是指位置
         */
        JSONObject parseObject = null;
        try {
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
            if (file.getSize() / 1024 > 4096) {
                byte[] imgBytes = ImgeUtils.compressPicByQuality(file.getBytes(), 0.1F);
                imgStr = Base64Util.encode(imgBytes);
            } else {
                imgStr = Base64Util.encode(file.getBytes());
            }
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");
            String param = "image=" + imgParam;
            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            Long id = (long) 1;
            Expiration expiration = expirationService.selectByPrimaryKey(id);
            String accessToken = "";
            AuthService authService = new AuthService();
            if (expiration == null) {
                accessToken = authService.getAuth();
                Long now = System.currentTimeMillis();
                Long expiration1 = now + 2592000;
                Expiration expiration2 = new Expiration();
                expiration2.setExpiration(expiration1);
                expiration2.setAccessToken(accessToken);
                expirationService.insert(expiration2);
            } else if (expiration != null & (System.currentTimeMillis() > expirationService.selectByPrimaryKey((long) 1).getExpiration())) {
                accessToken = authService.getAuth();
                Long now = System.currentTimeMillis();
                Long expiration1 = now + 2592000;
                expiration.setExpiration(expiration1);
                expiration.setAccessToken(accessToken);
                expirationService.update(expiration);
            } else if (expiration != null & (System.currentTimeMillis() < expirationService.selectByPrimaryKey((long) 1).getExpiration())) {
                accessToken = expiration.getAccessToken();
            }
            result = HttpUtil.post(url, accessToken, param);
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
        } catch (Exception e) {
        }
        return parseObject;
    }
}