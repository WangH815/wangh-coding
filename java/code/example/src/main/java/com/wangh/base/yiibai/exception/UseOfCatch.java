package com.wangh.base.yiibai.exception;

public class UseOfCatch {
    public static void main(String args[]) {
        int array[] = {10, 20, 30};
        int num1 = 15, num2 = 10;
        int result = 10;
        try {
            result = num1 / num2;
            System.out.println("The result is" + result);

            for (int i = 5; i >= 0; i--) {
                System.out.println("The value of array is" + array[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception occoured : " + e);
        }
    }
}
