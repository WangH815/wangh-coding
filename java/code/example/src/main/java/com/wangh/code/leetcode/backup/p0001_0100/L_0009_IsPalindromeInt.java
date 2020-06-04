package com.wangh.code.leetcode.backup.p0001_0100;

public class L_0009_IsPalindromeInt {
    public static void main(String[] args) {
        System.out.println(isPalindromeInt1(213));
        System.out.println(isPalindromeInt2(213));
        System.out.println(isPalindromeInt1(121));
        System.out.println(isPalindromeInt2(121));
    }

    public static boolean isPalindromeInt1(int x) {
        if (x < 0) {
            return false;
        }
        int rev = reverse(x);
        return x == rev;
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10)
                return 0;
            if (rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static boolean isPalindromeInt2(int x) {
        if (x < 0) {
            return false;
        }
        int digit = (int) (Math.log(x) / Math.log(10) + 1); //总位数
        int revert = 0;
        int pop = 0;
        //倒置右半部分
        for (int i = 0; i < digit / 2; i++) {
            pop = x % 10;
            revert = revert * 10 + pop;
            x /= 10;
        }
        if (digit % 2 == 0 && x == revert) {
            return true;
        }
        //奇数情况 x 除以 10 去除 1 位
        if (digit % 2 != 0 && x / 10 == revert) {
            return true;
        }
        return false;
    }

}
