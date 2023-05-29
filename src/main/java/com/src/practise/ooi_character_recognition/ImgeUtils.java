package com.src.practise.ooi_character_recognition;


import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * 图片处理工具类
 * @explain
 * @author Marydon
 * @creationTime 2019年9月3日上午10:14:17
 * @version 1.0
 * @since
 * @email marydon20170307@163.com
 */
public class ImgeUtils {
    /**
     * 压缩图片（通过降低图片质量）
     *
     * @param quality 图片质量（0-1）
     * @return byte[]
     * 压缩后的图片（jpg）
     * @throws
     * @explain 压缩图片, 通过压缩图片质量，保持原图大小
     */
    public static byte[] compressPicByQuality(byte[] imgByte, float quality) {
        byte[] imgBytes = null;
        try {
            ByteArrayInputStream byteInput = new ByteArrayInputStream(imgByte);
            BufferedImage image = ImageIO.read(byteInput);

            // 如果图片空，返回空
            if (image == null) {
                return null;
            }
            // 得到指定Format图片的writer（迭代器）
            Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("jpeg");
            // 得到writer
            ImageWriter writer = (ImageWriter) iter.next();
            // 得到指定writer的输出参数设置(ImageWriteParam )
            ImageWriteParam iwp = writer.getDefaultWriteParam();
            // 设置可否压缩
            iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            // 设置压缩质量参数
            iwp.setCompressionQuality(quality);

            iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);

            ColorModel colorModel = ColorModel.getRGBdefault();
            // 指定压缩时使用的色彩模式
            iwp.setDestinationType(
                    new javax.imageio.ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(16, 16)));

            // 开始打包图片，写入byte[]
            // 取得内存输出流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            IIOImage iIamge = new IIOImage(image, null, null);

            // 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput
            // 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput
            writer.setOutput(ImageIO.createImageOutputStream(byteArrayOutputStream));
            writer.write(null, iIamge, iwp);
            imgBytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            System.out.println("write errro");
            e.printStackTrace();
        }
        return imgBytes;
    }
}