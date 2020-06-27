package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RollHoursMonths {
    public static void main(String[] args) throws Exception {
        Date curDate = new Date();
        Calendar cl = Calendar.getInstance();

        cl.setTime(curDate);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr = format.format(cl.getTime());
        System.out.println("当前时间：" + DateToStr);

        // 12个月后的时间
        cl.setTime(curDate);
        cl.roll(Calendar.MONTH, 2);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr2 = format2.format(cl.getTime());
        System.out.println("当前时间加上12个月后的时间：" + DateToStr2);

        // 10个小时后的时间
        cl.setTime(curDate);
        cl.roll(Calendar.HOUR, 1);
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr3 = format3.format(cl.getTime());
        System.out.println("当前时间加上10小时后的时间：" + DateToStr3);
    }
}