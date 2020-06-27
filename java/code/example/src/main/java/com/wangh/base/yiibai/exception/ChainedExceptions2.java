package com.wangh.base.yiibai.exception;

public class ChainedExceptions2 {
    public static void main(String args[]) throws Exception {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println("The result is" + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occoured: " + ex);
            try {
                int data = 50 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println("rest of the code...");
        }
    }
}
