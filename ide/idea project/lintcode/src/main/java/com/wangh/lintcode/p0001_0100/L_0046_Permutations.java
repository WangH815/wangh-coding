package com.wangh.lintcode.p0001_0100;

import java.util.ArrayList;
import java.util.List;

public class L_0046_Permutations {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> permute1(int[] nums) {
        return permute_end1(nums, nums.length - 1);
    }

    // end 表示当前新增的数字的位置
    private static List<List<Integer>> permute_end1(int[] nums, int end) {
        // 只有一个数字的时候
        if (end == 0) {
            List<List<Integer>> all = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            all.add(temp);
            return all;
        }
        //得到上次所有的结果
        List<List<Integer>> all_end = permute_end1(nums, end - 1);
        int current_size = all_end.size();
        //遍历每一种情况
        for (int j = 0; j < current_size; j++) {
            //在数字的缝隙插入新的数字
            for (int k = 0; k <= end; k++) {
                List<Integer> temp = new ArrayList<>(all_end.get(j));
                temp.add(k, nums[end]);
                //添加到结果中
                all_end.add(temp);
            }
        }
        //由于 all_end 此时既保存了之前的结果，和添加完的结果，所以把之前的结果要删除
        for (int j = 0; j < current_size; j++) {
            all_end.remove(0);
        }
        return all_end;
    }

    public static List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        all.add(new ArrayList<>());
        //在上边的基础上只加上最外层的 for 循环就够了，代表每次新添加的数字
        for (int i = 0; i < nums.length; i++) {
            int current_size = all.size();
            for (int j = 0; j < current_size; j++) {
                for (int k = 0; k <= i; k++) {
                    List<Integer> temp = new ArrayList<>(all.get(j));
                    temp.add(k, nums[i]);
                    all.add(temp);
                }
            }
            for (int j = 0; j < current_size; j++) {
                all.remove(0);
            }
        }
        return all;
    }

    public static List<List<Integer>> permute3(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack3(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack3(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // 已经存在的元素，跳过
                tempList.add(nums[i]); //将当前元素加入
                backtrack3(list, tempList, nums); //向后继续添加
                tempList.remove(tempList.size() - 1); //将 tempList 刚添加的元素，去掉，尝试新的元素
            }
        }
    }

    public static List<List<Integer>> permute4(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        //从下标 0 开始的所有组合
        upset4(nums, 0, all);
        return all;
    }

    private static void upset4(int[] nums, int begin, List<List<Integer>> all) {
        if (begin == nums.length) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            all.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            swap4(nums, i, begin);
            upset4(nums, begin + 1, all);
            swap4(nums, i, begin);
        }

    }

    private static void swap4(int[] nums, int i, int begin) {
        int temp = nums[i];
        nums[i] = nums[begin];
        nums[begin] = temp;
    }

}
