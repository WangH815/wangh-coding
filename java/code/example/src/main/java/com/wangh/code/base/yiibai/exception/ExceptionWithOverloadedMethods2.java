package com.wangh.code.base.yiibai.exception;

class NewClass1 {
    void msg() throws Exception {
        System.out.println("this is parent");
    }
}

public class ExceptionWithOverloadedMethods2 extends NewClass1 {
    ExceptionWithOverloadedMethods2() {
    }

    void msg() throws ArithmeticException {
        System.out.println("This is child");
    }

    public static void main(String args[]) {
        ExceptionWithOverloadedMethods2 n = new ExceptionWithOverloadedMethods2();
        try {
            n.msg();
        } catch (Exception e) {
        }
    }
}
