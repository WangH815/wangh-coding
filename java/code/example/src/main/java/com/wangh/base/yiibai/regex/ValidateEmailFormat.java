package com.wangh.base.yiibai.regex;

public class ValidateEmailFormat {
    public static void main(String[] args) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = "admin@yiibai.com";
        Boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email1 + " :Valid = " + b);
        String email2 = "admin^domain.co.in";
        b = email2.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email2 + " :Valid = " + b);
    }
}
