package com.wangh.code.base.yiibai.regex;

public class CheckDateFormat {
    public static void main(String[] argv) {
        boolean isDate = false;
        String date1 = "9-15-1998";
        String date2 = "1997-08-16";
        String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";

        isDate = date1.matches(datePattern);
        System.out.println("Date :" + date1 + ": matches with the this date Pattern:" + datePattern + "Ans:" + isDate);

        isDate = date2.matches(datePattern);
        System.out.println("Date :" + date2 + ": matches with the this date Pattern:" + datePattern + "Ans:" + isDate);
    }
}
