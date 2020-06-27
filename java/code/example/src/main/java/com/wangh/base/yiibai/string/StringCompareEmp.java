package com.wangh.base.yiibai.string;

public class StringCompareEmp{
	   public static void main(String args[]){
	      String str = "ab";
	      String anotherString = "b";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	   }
	}