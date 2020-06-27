package com.wangh.base.yiibai.string;

public class StringReverseExample2 {
    public static void main(String[] args) {
        String input = "yiibai.com";
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}