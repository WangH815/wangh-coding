package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplittingString {
    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find())
            System.out.println(m.group());
        m.reset("fix the rig with rags");
        while (m.find())
            System.out.println(m.group());
    }
}
