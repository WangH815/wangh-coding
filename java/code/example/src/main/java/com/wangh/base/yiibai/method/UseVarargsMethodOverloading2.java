package com.wangh.base.yiibai.method;

public class UseVarargsMethodOverloading2 {
    static void vararg(Integer... x) {
        System.out.println("Integer...");
    }

    static void vararg(String... x) {
        System.out.println("String...");
    }

    public static void main(String[] args) {
        int i = 0;
        vararg(i, i);
        String s = "";
        vararg(s, s);
    }
}