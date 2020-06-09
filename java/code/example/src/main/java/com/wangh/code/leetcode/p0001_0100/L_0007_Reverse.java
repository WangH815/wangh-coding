package com.wangh.code.leetcode.p0001_0100;

public class L_0007_Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1235134));
    }

    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ) return 0;
        return (int)rev;
    }

}
