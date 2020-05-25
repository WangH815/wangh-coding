package com.wangh.code.leetcode.p0001_0100;

import java.util.*;

public class L_0040_CombinationSumII {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSumII1(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getAnswer1(ans, new ArrayList<>(), candidates, target, 0);
        /*************修改的地方*******************/
        // 如果是 Input: candidates = [2,5,2,1,2], target = 5,
        // 输出会出现 [2 2 1] [2 1 2] 这样的情况，所以要去重
        return removeDuplicate1(ans);
        /****************************************/
    }

    private static void getAnswer1(List<List<Integer>> ans, ArrayList<Integer> temp, int[] candidates, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<Integer>(temp));
        } else if (target < 0) {
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                /*************修改的地方*******************/
                //i -> i + 1 ，因为每个数字只能用一次，所以下次遍历的时候不从自己开始
                getAnswer1(ans, temp, candidates, target - candidates[i], i + 1);
                /****************************************/
                temp.remove(temp.size() - 1);
            }
        }

    }

    private static List<List<Integer>> removeDuplicate1(List<List<Integer>> list) {
        Map<String, String> ans = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = list.get(i);
            Collections.sort(l);
            String key = "";
            for (int j = 0; j < l.size() - 1; j++) {
                key = key + l.get(j) + ",";
            }
            key = key + l.get(l.size() - 1);
            ans.put(key, "");
        }
        List<List<Integer>> ans_list = new ArrayList<List<Integer>>();
        for (String k : ans.keySet()) {
            String[] l = k.split(",");
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < l.length; i++) {
                int c = Integer.parseInt(l[i]);
                temp.add(c);
            }
            ans_list.add(temp);
        }
        return ans_list;
    }

    public static List<List<Integer>> combinationSumII2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); //排序
        getAnswer2(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private static void getAnswer2(List<List<Integer>> ans, ArrayList<Integer> temp, int[] candidates, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<Integer>(temp));
        } else if (target < 0) {
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                //跳过重复的数字
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                temp.add(candidates[i]);
                /*************修改的地方*******************/
                //i -> i + 1 ，因为每个数字只能用一次，所以下次遍历的时候不从自己开始
                getAnswer2(ans, temp, candidates, target - candidates[i], i + 1);
                /****************************************/
                temp.remove(temp.size() - 1);
            }
        }
    }

}
