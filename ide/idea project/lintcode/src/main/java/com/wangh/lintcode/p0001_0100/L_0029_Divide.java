package com.wangh.lintcode.p0001_0100;

public class L_0029_Divide {
    public static void main(String[] args) {
        System.out.println(divide1(123451, 23));
        System.out.println(divide2(123451, 23));
    }

    public static int divide1(int dividend, int divisor) {
        long ans = divide1((long) dividend, (long) (divisor));
        long m = 2147483648L;
        if (ans == m) {
            return Integer.MAX_VALUE;
        } else {
            return (int) ans;
        }
    }

    public static long divide1(long dividend, long divisor) {
        long ans = 1;
        long sign = 1;
        if (dividend < 0) {
            sign = opposite1(sign);
            dividend = opposite1(dividend);
        }
        if (divisor < 0) {
            sign = opposite1(sign);
            divisor = opposite1(divisor);
        }
        long origin_dividend = dividend;
        long origin_divisor = divisor;

        if (dividend < divisor) {
            return 0;
        }

        dividend -= divisor;
        while (divisor <= dividend) {
            ans = ans + ans;
            divisor += divisor;
            dividend -= divisor;
        }
        long a = ans + divide1(origin_dividend - divisor, origin_divisor);
        return sign > 0 ? a : opposite1(a);
    }

    public static long opposite1(long x) {
        return ~x + 1;
    }

    public static int divide2(int dividend, int divisor) {
        int ans = -1;
        int sign = 1;
        if (dividend > 0) {
            sign = opposite2(sign);
            dividend = opposite2(dividend);
        }
        if (divisor > 0) {
            sign = opposite2(sign);
            divisor = opposite2(divisor);
        }

        int origin_dividend = dividend;
        int origin_divisor = divisor;
        if (dividend > divisor) {
            return 0;
        }

        dividend -= divisor;
        while (divisor >= dividend) {
            ans = ans + ans;
            divisor += divisor;
            dividend -= divisor;
        }
        //此时我们传进的是两个负数，正常情况下，它就返回正数，但我们是在用负数累加，所以要取相反数
        int a = ans + opposite2(divide2(origin_dividend - divisor, origin_divisor));
        if (a == Integer.MIN_VALUE) {
            if (sign > 0) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if (sign > 0) {
                return opposite2(a);
            } else {
                return a;
            }
        }
    }

    public static int opposite2(int x) {
        return ~x + 1;
    }

}

