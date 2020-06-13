package com.wangh.code.base.yiibai.regex;

import java.util.regex.Pattern;

public class SplittingRegularExpression2 {
    public static void main(String a[]) {
        String s1 = "Learn how to use regular expression in Java programming. Here are most commonly used example";
        Pattern p1 = Pattern.compile("(to|Java|in|are|used)");
        String[] parts = p1.split(s1);

        for (String p : parts) {
            System.out.println(p);
        }
    }
}