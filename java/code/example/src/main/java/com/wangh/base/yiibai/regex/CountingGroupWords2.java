package com.wangh.base.yiibai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingGroupWords2 {
   public static void main(String[] args) {
      String s1 = "import java.util.regex.Pattern;importjava.util.regex.Matcher;";
      Pattern pattern = Pattern.compile("regex");
      Matcher  matcher = pattern.matcher(s1);
      int count = 0;

      while (matcher.find())count++;
      System.out.println(count);
   } 
}
