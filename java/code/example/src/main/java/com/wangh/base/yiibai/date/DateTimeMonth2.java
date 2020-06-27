package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeMonth2 {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("MMM");
        SimpleDateFormat f1 = new SimpleDateFormat("dd");
        SimpleDateFormat f2 = new SimpleDateFormat("a");
        int h;

        if (Calendar.getInstance().get(Calendar.HOUR) == 0)
            h = 12;
        else
            h = Calendar.getInstance().get(Calendar.HOUR);

        String filename = "Current Date is :" + f.format(new Date())
                + f1.format(new Date()) + "日" + h + "时" + f2.format(new Date());
        System.out.println(filename);
    }
}
