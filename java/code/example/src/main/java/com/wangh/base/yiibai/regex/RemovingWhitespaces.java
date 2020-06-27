package com.wangh.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovingWhitespaces {
    public static void main(String[] argv) {
        String str = "This is a Java program. This is another Java Program.";
        String pattern = "[\\s]";
        String replace = "";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        str = m.replaceAll(replace);
        System.out.println("After Whitespaces trim: "+str);
    }
}
