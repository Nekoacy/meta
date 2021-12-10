package com.test.date;

import java.security.Key;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class date02 {

    public static void main(String[] args) {
/*        long begin=System.currentTimeMillis();
        print();
        long end=System.currentTimeMillis();
        System.out.println("方法使用时间为："+(end-begin)+"毫秒");

    }
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

 */
        Random random = new Random();
        int index=0;
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        while (index<arr.length){
            int num=random.nextInt(11);
            System.out.println("生成的随机数："+ num);
            if (!contain(arr,num))
                arr[index++]=num;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        }
    public static boolean contain(int[] arr , int key){
       /* Arrays.sort(arr);
        return Arrays.binarySearch(arr, key)>=0;*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key)
                return true;
        }
        return false;
    }
}
