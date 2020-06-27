package com.wangh.base.yiibai.regex;

public class MatchingPhoneNumbers2 {
    private static boolean isValid(String s) {
        String regex = "(\\d{4}-\\d{8}|\\d{3}-\\d{8})";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValid("0898-66223344"));
        System.out.println(isValid("020-86222342"));
    }
}
