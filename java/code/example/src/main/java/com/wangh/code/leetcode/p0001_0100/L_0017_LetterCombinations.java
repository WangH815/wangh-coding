package com.wangh.code.leetcode.p0001_0100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L_0017_LetterCombinations {
    public static void main(String[] args) {
        letterCombinations1("3412");
        letterCombinations2("3412");

    }

    public static List<String> letterCombinations1(String digits) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            ans = mul(ans, getList(digits.charAt(i) - '0'));
        }
        return ans;

    }

    public static List<String> getList(int digit) {
        String digitLetter[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < digitLetter[digit].length(); i++) {
            ans.add(digitLetter[digit].charAt(i) + "");
        }
        return ans;
    }

    //定义成两个 List 相乘
    public static List<String> mul(List<String> l1, List<String> l2) {
        if (l1.size() != 0 && l2.size() == 0) {
            return l1;
        }
        if (l1.size() == 0 && l2.size() != 0) {
            return l2;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++)
            for (int j = 0; j < l2.size(); j++) {
                ans.add(l1.get(i) + l2.get(j));
            }
        return ans;
    }

    public static List<String> letterCombinations2(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) { //查看队首元素
                String t = ans.remove(); //队首元素出队
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        }
        return ans;
    }

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations3(String digits) {
        if (digits.equals("")) {
            return new ArrayList<String>();
        }
        List<String> ret = new LinkedList<String>();
        combination("", digits, 0, ret);
        return ret;
    }

    private void combination(String prefix, String digits, int offset, List<String> ret) {
        //offset 代表在加哪个数字
        if (offset == digits.length()) {
            ret.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offset + 1, ret);
        }
    }

}
