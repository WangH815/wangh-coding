package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DisplayingMonthsShortFormat2 {
    public static void main(String[] argv) throws Exception {
        String str1 = "yyyy-MM-dd";
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(str1, Locale.FRENCH);
        System.out.println(sdf.format(d));
        sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
        System.out.println(sdf.format(d));
    }
}