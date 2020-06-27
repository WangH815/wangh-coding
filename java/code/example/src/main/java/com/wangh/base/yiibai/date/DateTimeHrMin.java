package com.wangh.base.yiibai.date;

import java.util.Calendar;
import java.util.Formatter;

public class DateTimeHrMin {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
    }
}
