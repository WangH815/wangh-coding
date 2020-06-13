package com.wangh.code.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastIndexWord2 { 
   public static void main(String args[]) {
      String s1 = "Java is the one of best languagues, I like Java.";
      Pattern p1 = Pattern.compile("Java");

      Matcher m1 = p1.matcher(s1);
      m1.find();
      int nextIndex = m1.end();

      System.out.print("The last index is:");
      System.out.println(nextIndex);
   }
}
