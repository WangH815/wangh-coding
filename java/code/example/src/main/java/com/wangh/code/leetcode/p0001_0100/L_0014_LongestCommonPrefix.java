package com.wangh.code.leetcode.p0001_0100;

public class L_0014_LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix1(new String[]{"asdfcvb", "asdfwtrhgerb"}));
        System.out.println(longestCommonPrefix2(new String[]{"asdfcvb", "asdfwtrhgerb"}));
        System.out.println(longestCommonPrefix3(new String[]{"asdfcvb", "asdfwtrhgerb"}));
        System.out.println(longestCommonPrefix4(new String[]{"asdfcvb", "asdfwtrhgerb"}));
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0)
            return "";
        //得到最短的字符串的长度
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        int j = 0;
        //遍历所有列
        for (; j < minLength; j++) {
            //如果当前列字符不完全相同，则结束循环
            if (!isSameAtIndex(strs, j)) {
                break;
            }
        }
        return strs[0].substring(0, j);
    }

    public static boolean isSameAtIndex(String[] strs, int index) {
        int i = 0;
        while (i < strs.length - 1) {
            if (strs[i].charAt(index) == strs[i + 1].charAt(index)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        //遍历所有列
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i); // 保存 i 列第 0 行的字符便于后续比较
            //比较第 1,2,3... 行的字符和第 0 行是否相等
            for (int j = 1; j < strs.length; j++) {
                /**
                 * i == strs[j].length() 表明当前行已经到达末尾
                 * strs[j].charAt(i) != c  当前行和第 0 行字符不相等
                 * 上边两种情况返回结果
                 */
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefix3(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0]; // 保存结果
        // 遍历每一个字符串
        for (int i = 1; i < strs.length; i++) {
            // 找到上次得到的结果 prefix 和当前字符串的最长子串
            int minLen = Math.min(prefix.length(), strs[i].length());
            int j = 0;
            for (; j < minLen; j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

    public static String longestCommonPrefix4(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix4(strs, 0, strs.length - 1);
    }

    //递归不断分成两部分
    public static String longestCommonPrefix4(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix4(strs, l, mid);
            String lcpRight = longestCommonPrefix4(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    //求两个结果的最长公共前缀
    public static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }

}
