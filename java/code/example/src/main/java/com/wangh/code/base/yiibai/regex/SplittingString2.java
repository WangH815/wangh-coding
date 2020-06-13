package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplittingString2 {
    public static void main(String args[]) {
        Pattern p = Pattern.compile("\\d");
        Matcher mat1 = p.matcher("9652018244");

        while (mat1.find()) {
            System.out.println("\t" + mat1.group());
        }
        mat1.reset();
        System.out.println("After done resetting the Matcher, it should be like this");

        while (mat1.find()) {
            System.out.println("\t" + mat1.group());
        }
    }
}
