package com.wangh.base.yiibai.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class LanguageDate {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is : " + d1.toString());
        Locale loc = new Locale("zh");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
        System.out.println("today is : " + df.format(d1));
    }
}
