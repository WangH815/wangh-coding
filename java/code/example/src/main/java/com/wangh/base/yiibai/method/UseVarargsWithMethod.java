package com.wangh.base.yiibai.method;

public class UseVarargsWithMethod {
    static int sumvarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    public static void main(String args[]) {
        int sum = 0;
        sum = sumvarargs(new int[]{11, 22, 33});
        System.out.println("The sum of the numbers is: " + sum);
    }
}
