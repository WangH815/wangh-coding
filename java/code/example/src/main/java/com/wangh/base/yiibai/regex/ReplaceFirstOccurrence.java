package com.wangh.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceFirstOccurrence {
    public static void main(String args[]) {
        Pattern p = Pattern.compile("hello");
        String instring = "hello, hello word.";
        System.out.println("initial String: " + instring);
        Matcher m = p.matcher(instring);
        String tmp = m.replaceFirst("Java");
        System.out.println("String after replacing 1st Match: " + tmp);
    }
}
