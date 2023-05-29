package com.src.practise.oob_javaSE.b_data_type;

/**
 * 功能
 *
 * @author caojianbang
 * @date 26/11/2021 23:53
 */
public class Byte {
    public static void main(String[] args) {
        /**
         * 字节数组存放汉字
         *
         * public byte[] getBytes()
         * 使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中。
         */
        String s = "是";
        byte[] bs = s.getBytes();
        for (int i=0;i<bs.length;i++){
            System.out.println(bs[i]);
        }
        String ss = new String(bs);
        System.out.println(ss);//是
        System.out.println(bs.length);//数组长度是3

        //byte整数类型可以存放字符，所以可以用字节数组操作IO
        byte a='a';
        System.out.println(a);//97

    }
}
