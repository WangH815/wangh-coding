package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeAmPm {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
