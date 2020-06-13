package com.wangh.code.base.yiibai.string;

public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            String s1 = "This is a String";
            String s2 = "This is a String";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for creation" + " of String literals : "
                + (endTime - startTime) + " ms");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            String s3 = new String("This is a String");
            String s4 = new String("This is a String");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation" + " of String objects : "
                + (endTime1 - startTime1) + " ms");
    }
}
