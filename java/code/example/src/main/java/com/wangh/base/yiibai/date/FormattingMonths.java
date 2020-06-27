package com.wangh.base.yiibai.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingMonths {
    public static void main(String[] args) {
        // 示例-1
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        System.out
                .println("Current Month in MMMM format : " + sdf.format(date));

        // 示例-2
        Format formatter = new SimpleDateFormat("MMMM");
        String s = formatter.format(new Date());
        System.out.println(s);
    }
}