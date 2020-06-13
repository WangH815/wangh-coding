package com.wangh.code.base.yiibai.string;

public class StringCompareequlA {
    public static void main(String[] args) {
        String s1 = "yiibai";
        String s2 = "yiibai";
        String s3 = new String("yiibai");
        String s4 = new String("yiibai");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        
    }
}