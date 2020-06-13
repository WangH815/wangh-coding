package com.wangh.code.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddTime2Date {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr = format.format(d1);

        System.out.println("当前时间 : " + DateToStr);

        cl.setTime(d1);
        cl.add(Calendar.MONTH, 1);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr2 = format2.format(cl.getTime());

        System.out.println("加上一个月后的时间为： " + DateToStr2);

        cl.setTime(d1);
        cl.add(Calendar.HOUR, 7);
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr3 = format3.format(cl.getTime());
        System.out.println("加上7个小时后的时间： " + DateToStr3);

        cl.setTime(d1);
        cl.add(Calendar.YEAR, 3);
        SimpleDateFormat format4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr4 = format4.format(cl.getTime());
        System.out.println("加上3年后的时间： " + DateToStr4);
    }
}
