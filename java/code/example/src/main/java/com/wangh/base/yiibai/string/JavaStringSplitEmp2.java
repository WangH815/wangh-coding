package com.wangh.base.yiibai.string;

public class JavaStringSplitEmp2 {
    public static void main(String args[]) {
        String s1 = "y i i b a i . c o m";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
 