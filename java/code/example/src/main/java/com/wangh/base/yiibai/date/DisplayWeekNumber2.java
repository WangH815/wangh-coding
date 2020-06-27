package com.wangh.base.yiibai.date;

import java.util.Calendar;

public class DisplayWeekNumber2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current week of month is : "
                + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current week of year is : "
                + cal.get(Calendar.WEEK_OF_YEAR));
        cal.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println("date after one year : "
                + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE)
                + "-" + cal.get(Calendar.YEAR));
    }
}
