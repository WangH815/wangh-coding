package com.wangh.code.base.yiibai.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDateFormat2 {
    public static void main(String args[]) {
        List<String> dates = new ArrayList<String>();
        dates.add("1990-12-21");
        dates.add("1990-12-31");
        dates.add("1990-12-32");
        dates.add("09-12-12");
        dates.add("2001-02-10");
        String regex = "^([0-9]{4})-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$";
        Pattern pattern = Pattern.compile(regex);

        for (Object date : dates) {
            Matcher matcher = pattern.matcher((CharSequence) date);
            System.out.println(date + " : " + matcher.matches());
        }
    }
}
