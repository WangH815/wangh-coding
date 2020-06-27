package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DisplayingWeekdays2 {
    public static void main(String[] argv) throws Exception {
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE", Locale.US);
        String str = dateFormat.format(d);
        System.out.println(str);
    }
}
