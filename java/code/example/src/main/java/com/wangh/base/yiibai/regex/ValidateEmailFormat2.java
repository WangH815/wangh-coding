package com.wangh.base.yiibai.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailFormat2 {
   public static void main(String args[]) {
      List<String> emails = new ArrayList<String>();
      emails.add("admin@yiibai.com");
      emails.add("yes2dos@gmail.com");
      emails.add("maxsu%google-cn.com");
      emails.add("maxsua@gmail-cn.com");
      emails.add("said#@youtube.co.in");
      emails.add("atosll@domaincom");
      emails.add("kitte#gmail.com");
      emails.add("@yiibai.com");

      String regex = "^(.+)@(.+)$";
      Pattern pattern = Pattern.compile(regex);

      for (Object email : emails) {
         Matcher matcher = pattern.matcher((CharSequence) email);
         System.out.println(email + " : " + matcher.matches());
      } 
   }
}
