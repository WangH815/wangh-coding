package com.wangh.base.yiibai.exception;

class MyException extends Exception {
    String s1;

    MyException(String s2) {
        s1 = s2;
    }

    @Override
    public String toString() {
        return ("Output String = " + s1);
    }
}

public class UserDefinedException {
    public static void main(String args[]) {
        try {
            throw new MyException("Custom message");
        } catch (MyException exp) {
            System.out.println(exp);
        }
    }
}
