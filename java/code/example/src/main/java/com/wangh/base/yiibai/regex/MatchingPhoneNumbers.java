package com.wangh.base.yiibai.regex;

public class MatchingPhoneNumbers {
    public static void main(String args[]) {
        isPhoneValid("13877889900");
        isPhoneValid("184-585-4009");
        isPhoneValid("13977889900");
        isPhoneValid("12345678900");
        isPhoneValid("1.999-585-4009");
        isPhoneValid("089812399312");
        isPhoneValid("1 585 4009");
        isPhoneValid("136-myphone123");
        isPhoneValid("17789722552");
    }

    public static boolean isPhoneValid(String phone) {
        boolean retval = false;
        String phoneNumberPattern = "^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\\d{8})?$";
        retval = phone.matches(phoneNumberPattern);
        String msg = "No, pattern:" + phone + " regex: " + phoneNumberPattern;
        if (retval) {
            msg = "Yes, pattern:" + phone + " regex: " + phoneNumberPattern;
        }
        System.out.println(msg);
        return retval;
    }
}
