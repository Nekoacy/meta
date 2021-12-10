package com.test.string;

import java.util.Arrays;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class value {
    public static void main(String[] args) {
        double d=101.00;
        boolean b=false;
        long l=123456789;
        char[] arr={'l','o','v','e'};
        System.out.println("返回值 : "+String.valueOf(d));
        System.out.println("返回值 : "+String.valueOf(b));
        System.out.println("返回值 : "+String.valueOf(l));
        System.out.println("返回值 : "+String.valueOf(arr));
        System.out.println("返回值 : "+String.valueOf(arr,1,3));
        /**
         * valueOf(boolean b): 返回 boolean 参数的字符串表示形式。.
         *
         * valueOf(char c): 返回 char 参数的字符串表示形式。
         *
         * valueOf(char[] data): 返回 char 数组参数的字符串表示形式。
         *
         * valueOf(char[] data, int offset, int count): 返回 char 数组参数的特定子数组的字符串表示形式。
         *
         * valueOf(double d): 返回 double 参数的字符串表示形式。
         *
         * valueOf(float f): 返回 float 参数的字符串表示形式。
         *
         * valueOf(int i): 返回 int 参数的字符串表示形式。
         *
         * valueOf(long l): 返回 long 参数的字符串表示形式。
         *
         * valueOf(Object obj): 返回 Object 参数的字符串表示形式。
         */
    }
}
