package com.wangh.code.base.yiibai.exception;

public class MultipleException2 {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 120 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }
}
