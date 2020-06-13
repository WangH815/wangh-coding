package com.wangh.code.base.yiibai.regex;

import java.util.regex.Pattern;

public class SplittingRegularExpression {
   public static void main(String args[]) {
      Pattern p = Pattern.compile(" ");
      String tmp = "this is the Java example";
      String[] tokens = p.split(tmp);

      for (int i = 0; i < tokens.length; i++) {
         System.out.println(tokens[i]);
      }
   }
}
