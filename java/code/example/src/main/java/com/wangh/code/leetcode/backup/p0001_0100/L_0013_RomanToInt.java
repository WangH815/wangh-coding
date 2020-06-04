package com.wangh.code.leetcode.backup.p0001_0100;

public class L_0013_RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt1("CXXIII"));
        System.out.println(romanToInt2("CXXIII"));
        System.out.println(romanToInt3("CXXIII"));
    }

    public static int romanToInt1(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += getInt(s.charAt(i), s.charAt(i + 1));
            //判断是否是两个字符的特殊情况
            if (isGetTwoInt(s.charAt(i), s.charAt(i + 1))) {
                i++;
            }
        }
        //将最后一个字符单独判断，如果放到上边的循环会越界
        if (!(s.length() >= 2 && isGetTwoInt(s.charAt(s.length() - 2), s.charAt(s.length() - 1)))) {
            ans += getInt(s.charAt(s.length() - 1));
        }

        return ans;
    }

    public static int getInt(char r) {
        int ans = 0;
        switch (r) {
            case 'I':
                ans = 1;
                break;
            case 'V':
                ans = 5;
                break;
            case 'X':
                ans = 10;
                break;
            case 'L':
                ans = 50;
                break;
            case 'C':
                ans = 100;
                break;
            case 'D':
                ans = 500;
                break;
            case 'M':
                ans = 1000;
        }
        return ans;
    }

    public static int getInt(char r, char r_after) {
        int ans = 0;
        switch (r) {
            case 'I':
                ans = 1;
                break;
            case 'V':
                ans = 5;
                break;
            case 'X':
                ans = 10;
                break;
            case 'L':
                ans = 50;
                break;
            case 'C':
                ans = 100;
                break;
            case 'D':
                ans = 500;
                break;
            case 'M':
                ans = 1000;
                break;
        }
        if (r == 'I') {
            switch (r_after) {
                case 'V':
                    ans = 4;
                    break;
                case 'X':
                    ans = 9;
            }
        }
        if (r == 'X') {
            switch (r_after) {
                case 'L':
                    ans = 40;
                    break;
                case 'C':
                    ans = 90;
            }
        }
        if (r == 'C') {
            switch (r_after) {
                case 'D':
                    ans = 400;
                    break;
                case 'M':
                    ans = 900;
            }
        }
        return ans;

    }

    public static boolean isGetTwoInt(char r, char r_after) {
        if (r == 'I') {
            switch (r_after) {
                case 'V':
                    return true;
                case 'X':
                    return true;
            }
        }
        if (r == 'X') {
            switch (r_after) {
                case 'L':
                    return true;
                case 'C':
                    return true;
            }
        }
        if (r == 'C') {
            switch (r_after) {
                case 'D':
                    return true;
                case 'M':
                    return true;
            }
        }
        return false;
    }

    public static int romanToInt2(String s) {
        int sum = 0;
        if (s.indexOf("IV") != -1) {
            sum -= 2;
        }
        if (s.indexOf("IX") != -1) {
            sum -= 2;
        }
        if (s.indexOf("XL") != -1) {
            sum -= 20;
        }
        if (s.indexOf("XC") != -1) {
            sum -= 20;
        }
        if (s.indexOf("CD") != -1) {
            sum -= 200;
        }
        if (s.indexOf("CM") != -1) {
            sum -= 200;
        }

        char c[] = s.toCharArray();
        int count = 0;

        for (; count <= s.length() - 1; count++) {
            if (c[count] == 'M') sum += 1000;
            if (c[count] == 'D') sum += 500;
            if (c[count] == 'C') sum += 100;
            if (c[count] == 'L') sum += 50;
            if (c[count] == 'X') sum += 10;
            if (c[count] == 'V') sum += 5;
            if (c[count] == 'I') sum += 1;

        }
        return sum;
    }

    public static int romanToInt3(String s) {
        int res = 0;
        if (s.length() == 0) return res;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = getVal(s.charAt(i));
            int nex = getVal(s.charAt(i + 1));
            if (cur < nex) {
                res -= cur;
            } else {
                res += cur;
            }
        }
        return res + getVal(s.charAt(s.length() - 1));
    }

    public static int getVal(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }

}
