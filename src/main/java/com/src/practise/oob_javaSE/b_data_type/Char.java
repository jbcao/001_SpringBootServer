package com.src.practise.oob_javaSE.b_data_type;

/**
 * 字符类型
 * 可以表示 单个字符，字符类型是char。char是两个字节(可以存放汉字)
 * 多个字符我们称为字符串，在java中String这种数据类型表示，但是String不是基本数据类型，而是类，类是复合数据类型。
 * <p>
 * 结论：在java中，对char进行运算的时候，直接当做ascii码对应的整数对待。
 */
public class Char {
    public static void main(String[] args) {
        char c = 'q';
        System.out.println(c);
        int teat1 = 'a' + 'b';
        int teat2 = 'a' - 'b';
        System.out.println(teat1);
        System.out.println(teat2);
        char teat3 = 'a' + 'b';
        char test4 = 'a' + 28;
        System.out.println(teat3);
        System.out.println(test4);
        int teat5 = '中';
        System.out.println(teat5);

        //int a= 1.2;这样编译不通过，这样违背数据从低精度到高精度的转换
//
//        结论：数据类型可以自动的从低精度-->高精度。高精度不能转为低精度。
//
//        byte小于<short小于<int小于<long小于<float小于<double
        double b=3;

        int i= (int) 1.2;
        int i1= (int) 1.9;
        System.out.println(i +""+ ""+i1);
        //两个都输出1，后面不管是多少，统统截取掉了
    }
}