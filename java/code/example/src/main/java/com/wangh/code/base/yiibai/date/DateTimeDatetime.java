package com.wangh.code.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateTimeDatetime {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tc", cal);
        System.out.println(fmt);

        // 中国时间格式
        Date d = new Date();
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        // simpDate = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        System.out.println(simpDate.format(d));
        
    }
}
