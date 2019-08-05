package com.wangh.lintcode.p0001_0100;

public class L_0028_IndexOfString {
    public static void main(String[] args) {
        String haystack = "hello,abcdef";
        String needle = "abc";
        System.out.println(indexOfString1(haystack, needle));
        System.out.println(indexOfString2(haystack, needle));
    }

    public static int indexOfString1(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int j = 0;
        //遍历每个字符
        for (int i = 0; i < haystack.length(); i++) {
            //相等的话计数加 1
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                //长度够了就返回
                if (j == needle.length()) {
                    return i - j + 1;
                }
                // 不相等的话 j 清零，
                // 并且 i 回到最初的位置，之后就进入 for 循环中的 i++，从下个位置继续判断
            } else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }

    public static int indexOfString2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

}
