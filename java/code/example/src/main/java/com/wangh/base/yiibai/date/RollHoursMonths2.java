package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RollHoursMonths2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Time:" + cal.getTime());

        cal.roll(Calendar.YEAR, false);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr = format.format(cal.getTime());
        System.out.println("向上滚下1年：" + DateToStr);


        cal.roll(Calendar.HOUR, true);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String DateToStr2 = format2.format(cal.getTime());
        System.out.println("向上滚动1小时: " + DateToStr2);
    }
}
