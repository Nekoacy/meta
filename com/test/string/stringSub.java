package com.test.string;

import java.util.Locale;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class stringSub {
    public static void main(String[] args) {
        String Str1 = new String("I have an apple");
        System.out.println(Str1.substring(2));
        System.out.println(Str1.substring(2, 6));

        System.out.println(Str1.toCharArray());//toCharArray() 方法将字符串转换为字符数组。

        System.out.println(Str1.toLowerCase(Locale.ROOT));//toLowerCase() 方法将字符串转换为小写。
    }
}
