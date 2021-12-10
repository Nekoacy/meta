package com.test.string;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class stringRep {
    public static void main(String[] args) {
        String Str1=new String("WeakPay");
        System.out.println(Str1);
        System.out.println("修改后返回值：");
        System.out.println(Str1.replace('P','D'));
    }
}
