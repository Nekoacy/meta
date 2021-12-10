package com.company.Array;



public class array {
    public static void main(String[] args) {
        String[] strs={"hello","back","numpy"};
        String[] news= new String[10];
        System.arraycopy(strs,0,news,0,strs.length);
        for (int i = 0; i < news.length; i++) {
            System.out.println(news[i]);
        }
        System.out.println("---------------------");
        Object[] objs={new Object(),new Object(),new Object()};
        Object[] newobjs=new Object[5];
        System.arraycopy(objs,0,newobjs,0,objs.length);
        for (int i = 0; i < newobjs.length; i++) {
            System.out.println(newobjs[i]);
        }
        }
}

