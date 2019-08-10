package com.wangh.leetcode.p0001_0100;

public class L_0041_FirstMissingPositive {
    public static void main(String[] args) {

    }

    public static int firstMissingPositive1(int[] nums) {
        int n = nums.length;
        //遍历每个数字
        for (int i = 0; i < n; i++) {
            //判断交换回来的数字
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                //第 nums[i] 个位置的下标是 nums[i] - 1
                swap1(nums, i, nums[i] - 1);
            }
        }
        //找出第一个 nums[i] != i + 1 的位置
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        //如果之前的数都满足就返回 n + 1
        return n + 1;
    }

    private static void swap1(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        //将正数移到前边，并且得到正数的个数
        int k = positiveNumber2(nums);
        for (int i = 0; i < k; i++) {
            //得到要标记的下标
            int index = Math.abs(nums[i]) - 1;
            if (index < k) {
                //判断要标记的位置的数是不是小于 0，不是小于 0 就取相反数
                int temp = Math.abs(nums[index]);
                nums[index] = temp < 0 ? temp : -temp;
            }
        }
        //找到第一个大于 0 的位置
        for (int i = 0; i < k; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return k + 1;
    }

    private static int positiveNumber2(int[] nums) {
        //解法一 把负数和 0 全部交换到最后
        /*int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] <= 0) {
                swap(nums, i, n - 1);
                n--;
                if (i == n) {
                    break;
                }
            }
        }
        return n;*/

        //解法二 用一个指针 p ，保证 p 之前的都是正数。遍历 nums，每遇到一个正数就把它交换到 p 指针的位置，并且 p 指针后移
        int n = nums.length;
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                swap2(nums, i, p);
                p++;
            }
        }
        return p;

    }

    private static void swap2(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
