package com.wangh.base.yiibai.string;

public class StringReverseExample {
    public static void main(String[] args) {
        String string = "abc123";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("String before reverse: " + string);
        System.out.println("String after reverse: " + reverse);
    }
}
