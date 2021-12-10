package com.test.enum1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLOutput;

/**
 * @author Shibo
 * @date 2021/12/9
 * @apiNote
 */
enum Color{
    RED,GREEN,BLUE;
    private Color(){
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo(){
        System.out.println("Universal Color");
    }
}
public class enum01 {
    public static void main(String[] args) {
        Color colo=Color.RED;
        System.out.println(colo);
        colo.colorInfo();

        /*for (Color myVar:Color.values())
            System.out.println(myVar);*/

        /*Color color=Color.RED;
        switch (color){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }*/

        /*Color[] arr=Color.values();
        for (Color col:arr)
            System.out.println(col + " at index " + col.ordinal());
        System.out.println(Color.valueOf("RED"));*/

    }
}
