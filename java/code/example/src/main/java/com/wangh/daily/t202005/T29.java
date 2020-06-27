package com.wangh.daily.t202005;

public class T29 {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(Integer.valueOf(0x7fffffff));
        System.out.println(Integer.toString(Integer.MAX_VALUE, 2));
        System.out.println(rangeBitwiseAnd(12, 120000));
    }

    private static long fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    private static int rangeBitwiseAnd(int m, int n) {
        int res = m;
        for (int i = m + 1; i <= n; i++) {
            res &= i;
        }
        return res;
    }
}
