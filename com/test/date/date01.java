package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author Shibo
 * @date 2021/12/8
 * @apiNote
 */
public class date01 {
    public static void main(String[] args) throws ParseException {
        //Date date=new Date();
        //System.out.println(date.toString());

        //DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy  HH:mm:ss");
        //String dateStr = dateFormat.format(date);
        //System.out.println(dateStr);

        //System.out.printf("年-月-日格式：%tF%n",date);

        //字符串转为date, SimpleDateFormat方法
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        String input = args.length == 0 ? "2021-12-08" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }

}
