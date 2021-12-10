package com.test.string;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class string01 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String ss2= new String("Hello");
        String s3 = "Hello world";
        char result = s2.charAt(2);
        System.out.println(result);

        int comp = s1.compareTo(s2);
        System.out.println(comp);
        System.out.println(s1.compareTo(s3));
        System.out.println("-------equals");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(ss2));
        /*equals比较的是地址。
        而compareTo是按照字典的顺序来比较字符串如果两个字符串相等则为0，
        若前面的字符串按照字典顺序较大则为正数，若前面的字符串按照字典顺序较小则为负数。
         */
        System.out.println("____contain");
        System.out.println(s1.contains("hel"));
        System.out.println(s1.contains("wor"));

        System.out.println("返回值 = "+s3.endsWith("world"));

        System.out.println("--------getBytes");
        try {
            byte[] Str2=s1.getBytes();
            System.out.println("返回值：" + Str2 );
            Str2=s1.getBytes("UTF-8");
            System.out.println("返回值：" + Str2 );
            Str2=s1.getBytes("ISO-8859-1");
            System.out.println("返回值：" + Str2 );
            Str2=s1.getBytes(StandardCharsets.UTF_8);
            System.out.println("返回值：" + Str2 );
        }catch (UnsupportedEncodingException e){
            System.out.println("不支持的字符集");
        }
    }
}