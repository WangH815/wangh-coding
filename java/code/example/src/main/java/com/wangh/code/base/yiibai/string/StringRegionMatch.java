package com.wangh.code.base.yiibai.string;

public class StringRegionMatch {
    public static void main(String[] args) {
        String first_str = "Welcome to IBM";
        String second_str = "I work with IBM";

        boolean match = first_str.regionMatches(11, second_str, 12, 3);
        System.out.println("first_str[11->14] == " + "second_str[12 -> 15]: "
                + match);
    }
}
