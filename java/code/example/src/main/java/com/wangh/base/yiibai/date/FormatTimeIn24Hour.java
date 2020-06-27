package com.wangh.base.yiibai.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTimeIn24Hour {
    public static void main(String[] args) {
        // 示例1
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdf.format(date));

        // 示例2
        Date d2 = new Date();
        SimpleDateFormat simpDate2;
        simpDate2 = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate2.format(d2));

        // 示例3
        Date d3 = new Date();
        SimpleDateFormat simpDate3;
        simpDate3 = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        System.out.println(simpDate3.format(d3));

    }
}
