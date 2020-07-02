package com.wangh.daily.t202007;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01 {
    public static void main(String[] args) {
        String str = LocalDate.now().toString();
        String regex = "(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }
    }
}
