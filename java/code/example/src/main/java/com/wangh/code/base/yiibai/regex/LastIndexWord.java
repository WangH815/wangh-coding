package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastIndexWord {
   public static void main(String args[]) {
      String candidateString = "This is a Java example.This is another Java example.";
      Pattern p = Pattern.compile("Java");

      Matcher matcher = p.matcher(candidateString);
      matcher.find();
      int nextIndex = matcher.end();

      System.out.print("The last index of Java is:");
      System.out.println(nextIndex);
   }
}
