package com.company.Array;

public class StackData {
    public static void main(String[] args) {
        Stack a=new Stack(2);
        a.push(1);
        a.push(9);
        a.pop();
        a.push(23);
        a.display();
    }
}
class Stack{
    private Object[] a;
    private int size;
    private int index=-1;

    public Stack() {
        this.a=new Object[10];
    }

    public Stack(int maxSize) {
        this.size = maxSize;
        this.a=new Object[size];
    }
    public void push(int b){
        if (index>=size-1){
            System.out.println("栈满");
        }
        a[++index]=b;
        System.out.println("压入"+b+",栈帧为："+index);
    }
    public Object pop(){
        if (index<=-1){
            System.out.println("栈空");
            return null;
        }
        System.out.println("弹出,栈帧为："+index);
        return a[index--];

    }
    public void display(){
        for (int i = index; i >0 ; i--) {
            System.out.println(a[i]);
        }
    }

    public Object[] getA() {
        return a;
    }

    public void setA(Object[] a) {
        this.a = a;
    }
}