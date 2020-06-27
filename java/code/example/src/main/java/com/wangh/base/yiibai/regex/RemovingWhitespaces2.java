package com.wangh.base.yiibai.regex;

import java.util.Scanner;

public class RemovingWhitespaces2 {
   public static void main (String[]args) { 
      String s1 = null; 
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a new string: ");
      s1 = scan.nextLine();
      System.out.println("Input String is  : "+s1);
      String s2 = s1.replaceAll("\\s+","");
      System.out.println("Output String is  : "+s2);
      scan.close();
   }
}
