package com.wangh.leetcode.p0001_0100;

import java.util.ArrayList;
import java.util.List;

public class L_0022_GenerateParenthesis {
    public static void main(String[] args) {

    }

    public static List<String> generateParenthesis1(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }

    public static List<String> generateParenthesis2(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, String cur, int left, int right, int n) {
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }
        //左括号不要超过 n
        if (left < n)
            backtrack(ans, cur + "(", left + 1, right, n);
        //右括号不要超过左括号
        if (right < left)
            backtrack(ans, cur + ")", left, right + 1, n);
    }

    public static List<String> generateParenthesis3(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int a = 0; a < n; a++)
                for (String left : generateParenthesis3(a))
                    for (String right : generateParenthesis3(n - 1 - a))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }

}
