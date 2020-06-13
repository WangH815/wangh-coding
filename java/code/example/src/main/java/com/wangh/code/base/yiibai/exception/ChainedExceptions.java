package com.wangh.code.base.yiibai.exception;

public class ChainedExceptions {
    public static void main(String args[]) throws Exception {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println("The result is" + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occoured: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("Chained exception thrown manually : " + ex1);
            }
        }
    }
}
