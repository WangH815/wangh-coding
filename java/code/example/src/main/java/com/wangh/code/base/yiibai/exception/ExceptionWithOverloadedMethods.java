package com.wangh.code.base.yiibai.exception;

public class ExceptionWithOverloadedMethods {
    double method(int i) throws Exception {
        return i / 0;
    }

    boolean method(boolean b) {
        return !b;
    }

    static double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }

    public static void main(String[] args) {
        ExceptionWithOverloadedMethods mn = new ExceptionWithOverloadedMethods();
        try {
            System.out.println(method(110, 120.0));
            System.out.println(method(110.0, 120));
            System.out.println(method(110.0, 120.0));
            System.out.println(mn.method(110));
        } catch (Exception ex) {
            System.out.println("exception occoure: " + ex);
        }
    }
}
