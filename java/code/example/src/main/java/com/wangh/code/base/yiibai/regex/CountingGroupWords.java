package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingGroupWords {
    public static void main(String args[]) {
        Pattern p = Pattern.compile("J(ava)");
        String candidateString = "This is Java. This is a Java example.";
        Matcher matcher = p.matcher(candidateString);
        int numberOfGroups = matcher.groupCount();
        System.out.println("numberOfGroups =" + numberOfGroups);
    }
}