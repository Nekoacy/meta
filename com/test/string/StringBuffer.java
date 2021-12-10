package com.test.string;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */

/**
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 * 在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer
 */
public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        StringBuffer stringBuffer = new StringBuffer();
        sb.append("wwww.");
        System.out.println(sb);
        sb.insert(5,"javaa!");
        System.out.println(sb);
        sb.delete(9,11);
        System.out.println(sb);
        System.out.println("----------");

/**
 * StringBuilder和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）
 */

    }
}
