package com.wangh.base.yiibai.array;

public class ArraySearchMaxMin {
    public static void main(String[] args) {
        int numbers[] = new int[]{28, 21, 17, 41, 34, 29, 15};
        int s = numbers[0];
        int l = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > l)
                l = numbers[i];
            else if (numbers[i] < s)
                s = numbers[i];
        }
        System.out.println("Largest Number is : " + l);
        System.out.println("Smallest Number is : " + s);
    }
}
