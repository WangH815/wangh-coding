package com.wangh.lintcode;

public class L_0010_IsMatch {
    public static void main(String[] args) {

    }

    public static boolean isMatch1(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();

        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        //只有长度大于 2 的时候，才考虑 *
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            //两种情况
            //pattern 直接跳过两个字符。表示 * 前边的字符出现 0 次
            //pattern 不变，例如 text = aa ，pattern = a*，第一个 a 匹配，然后 text 的第二个 a 接着和 pattern 的第一个 a 进行匹配。表示 * 用前一个字符替代。
            return (isMatch1(text, pattern.substring(2)) ||
                    (first_match && isMatch1(text.substring(1), pattern)));
        } else {
            return first_match && isMatch1(text.substring(1), pattern.substring(1));
        }
    }

    public static boolean isMatch2(String text, String pattern) {
        // 多一维的空间，因为求 dp[len - 1][j] 的时候需要知道 dp[len][j] 的情况，
        // 多一维的话，就可以把 对 dp[len - 1][j] 也写进循环了
        boolean[][] dp = new boolean[2][pattern.length() + 1];
        dp[text.length() % 2][pattern.length()] = true;

        // 从 len 开始减少
        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length(); j >= 0; j--) {
                if (i == text.length() && j == pattern.length())
                    continue;
                boolean first_match = (i < text.length() && j < pattern.length()
                        && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i % 2][j] = dp[i % 2][j + 2] || first_match && dp[(i + 1) % 2][j];
                } else {
                    dp[i % 2][j] = first_match && dp[(i + 1) % 2][j + 1];
                }
            }
        }
        return dp[0][0];
    }

}
