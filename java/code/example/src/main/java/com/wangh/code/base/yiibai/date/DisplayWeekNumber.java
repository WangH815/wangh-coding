package com.wangh.code.base.yiibai.date;

import java.util.Calendar;
import java.util.Date;

public class DisplayWeekNumber {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);

        System.out.println("today is " + Calendar.WEEK_OF_YEAR + " week of the year");
        System.out.println("today is a " + Calendar.DAY_OF_MONTH + " month of the year");
        System.out.println("today is a " + Calendar.WEEK_OF_MONTH + " week of the month");
    }
}
