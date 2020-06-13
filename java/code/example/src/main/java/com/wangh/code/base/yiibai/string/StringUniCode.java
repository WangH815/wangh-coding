package com.wangh.code.base.yiibai.string;

public class StringUniCode {
    public static void main(String[] args) {
        String test_string = "Aa";
        System.out.println("String under test is = " + test_string);

        System.out.println("Unicode code point at"
                + " position 15 in the string is = "
                + test_string.codePointBefore(2));
    }
}
