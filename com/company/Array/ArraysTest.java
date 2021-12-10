package com.company.Array;
import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        int[] a={2,3,5,4,12,8,13,15,61,32,1};
        //Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        Arrays.sort(a,2,7);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int index=Arrays.binarySearch(a,5);
        System.out.println(index==-1?"该元素不存在":"该元素下标是："+index);
    }
}
