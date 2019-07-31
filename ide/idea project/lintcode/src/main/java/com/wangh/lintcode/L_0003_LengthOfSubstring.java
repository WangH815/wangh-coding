package com.wangh.lintcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L_0003_LengthOfSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("qdfaasdvreav"));
        System.out.println(lengthOfLongestSubstring2("qdfaasdvreav"));
        System.out.println(lengthOfLongestSubstring3("qdfaasdvreav"));
        System.out.println(lengthOfLongestSubstring4("qdfaasdvreav"));
    }

    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int ans = 0;//保存当前得到满足条件的子串的最大值
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++) //之所以 j<= n，是因为我们子串是 [i,j),左闭右开
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i); //更新 ans
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();//初始化 hash set
        for (int i = start; i < end; i++) {//遍历每个字符
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false; //判断字符在不在 set 中
            set.add(ch);//不在的话将该字符添加到 set 里边
        }
        return true;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);//下标 + 1 代表 i 要移动的下个位置
        }
        return ans;
    }

    public static int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;//（下标 + 1） 代表 i 要移动的下个位置
        }
        return ans;
    }

}
