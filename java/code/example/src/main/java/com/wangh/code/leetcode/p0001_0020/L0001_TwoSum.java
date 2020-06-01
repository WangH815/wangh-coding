package com.wangh.code.leetcode.p0001_0020;


import java.util.Arrays;

/**
 * 给出一个无重复整数数组和一个目标和，输出数组中两数之和等于目标和的数组下标(一定有解)
 *
 * @in nums = [2, 7, 11, 15], target = 9
 * @return [0, 1]
 */
public class L0001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 6, 9, 2, 5};
        int target = 14;
        System.out.println(Arrays.toString(twoSum_1(nums, target)));
    }

    /**
     * 直接两重循环
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
