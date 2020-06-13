package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingWord {
    public static void main(String args[]) {
        String patternString = "java";
        String candidateString = "This is a java program. This is another java program.";
        // Matcher matcher = p.matcher(candidateString);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(candidateString);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : " + matcher.start() + " - " + matcher.end());
        }
    }
}
