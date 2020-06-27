package com.wangh.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingWord2 {
    public static void main(String[] args) {
        String s1 = "yiibai is one of best IT Yiibai website.";
        String regex = "\\btutorials\\b";
        Pattern p1 = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(s1);

        while (m1.find()) {
            System.out.print("Start index: " + m1.start());
            System.out.print(" End index: " + m1.end() + " ");
            System.out.println(m1.group());
        }
    }
}
