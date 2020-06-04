package com.wangh.code.leetcode.backup.p0001_0100;

import java.util.*;

public class L_0039_CombinationSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum1(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack1(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack1(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack1(list, tempList, nums, remain - nums[i], i);
                //找到了一个解或者 remain < 0 了，将当前数字移除，然后继续尝试
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<List<Integer>>> ans = new ArrayList<>(); //opt 数组
        Arrays.sort(nums);// 将数组有序，这样可以提现结束循环
        for (int sum = 0; sum <= target; sum++) { // 从 0 到 target 求出每一个 opt
            List<List<Integer>> ans_sum = new ArrayList<List<Integer>>();
            for (int i = 0; i < nums.length; i++) { //遍历 nums
                if (nums[i] == sum) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    ans_sum.add(temp);
                } else if (nums[i] < sum) {
                    List<List<Integer>> ans_sub = ans.get(sum - nums[i]);
                    //每一个加上 nums[i]
                    for (int j = 0; j < ans_sub.size(); j++) {
                        List<Integer> temp = new ArrayList<Integer>(ans_sub.get(j));
                        temp.add(nums[i]);
                        ans_sum.add(temp);
                    }
                } else {
                    break;
                }
            }
            ans.add(sum, ans_sum);
        }
        return removeDuplicate2(ans.get(target));
    }

    private static List<List<Integer>> removeDuplicate2(List<List<Integer>> list) {
        Map<String, String> ans = new HashMap<String, String>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = list.get(i);
            Collections.sort(l);
            String key = "";
            //[ 2 3 4 ] 转为 "2,3,4"
            for (int j = 0; j < l.size() - 1; j++) {
                key = key + l.get(j) + ",";
            }
            key = key + l.get(l.size() - 1);
            ans.put(key, "");
        }
        //根据逗号还原 List
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

    public static List<List<Integer>> combinationSum3(int[] nums, int target) {
        List<List<List<Integer>>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > target) {
            return new ArrayList<List<Integer>>();
        }
        // 先初始化 ans[0] 到 ans[target]，因为每次循环是更新 ans,会用到 ans.get() 函数，如果不初始化会报错
        for (int i = 0; i <= target; i++) {
            List<List<Integer>> ans_i = new ArrayList<List<Integer>>();
            ans.add(i, ans_i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int sum = nums[i]; sum <= target; sum++) {
                List<List<Integer>> ans_sum = ans.get(sum);
                List<List<Integer>> ans_sub = ans.get(sum - nums[i]);
                //刚开始 ans_sub 的大小是 0，所以单独考虑一下这种情况
                if (sum == nums[i]) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    ans_sum.add(temp);

                }
                //如果 ans.get(sum - nums[i])大小不等于 0，就可以按之前的想法更新了。
                //每个 ans_sub[j] 都加上 nums[i]
                if (ans_sub.size() > 0) {
                    for (int j = 0; j < ans_sub.size(); j++) {
                        ArrayList<Integer> temp = new ArrayList<Integer>(ans_sub.get(j));
                        temp.add(nums[i]);
                        ans_sum.add(temp);
                    }
                }
            }
        }
        return ans.get(target);
    }

}
