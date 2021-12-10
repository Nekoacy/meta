package com.test.character;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class integer {
    public static void main(String[] args) {
        Integer i=new Integer(100);
        System.out.println(i);
        Integer i1=new Integer("123");//不能中文字符，String->Integer
        String k=String.valueOf(i1);//Integer->String
        System.out.println(i1);
        System.out.println(Integer.MAX_VALUE);
        //x是一个引用，变量，保存的是一个对象的内存地址。
        Integer x=1000;//等同于Integer x=new Integer(1000);
        Integer a=1000;
        System.out.println("--------");
        System.out.println(x==a);
        Integer b=100;//int->Integer
        Integer c=100;
        System.out.println(b==c);//-128——127之间是在方法区“整数型常量池”提前创建好了的
        String y="134";
        System.out.println(x+1);
        System.out.println(y);


        int retValue =Integer.parseInt("124");//String->int
        System.out.println(retValue+100);
        //int——>String
        String s2="124"+"";
        System.out.println(s2+1);
    }
}
