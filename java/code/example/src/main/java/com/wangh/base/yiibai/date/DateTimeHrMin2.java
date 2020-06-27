package com.wangh.base.yiibai.date;

import java.util.Calendar;

public class DateTimeHrMin2 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":"
                + now.get(Calendar.MINUTE));
    }
}
