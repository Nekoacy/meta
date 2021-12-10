package com.test.enum1;

import java.util.Scanner;

/**
 * @author Shibo
 * @date 2021/12/9
 * @apiNote
 */

public class enum02 {
    public static void main(String[] args) {
        UserService  us=new UserService();

        try {
            us.register("andersen","password");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
class UserService{
    public void register(String username,String password) throws MyException {

        if (username.length()<6||username.length()>14||username==null) {
            throw new MyException("你的用户名长度错误！请再次输入[6-14]");
        }
        System.out.println("注册成功！");
    }
}
class MyException extends Exception{
    public MyException() {
    }
    public MyException(String s){
        super(s);
    }
}