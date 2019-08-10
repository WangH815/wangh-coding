package com.wangh.leetcode.p0001_0100;

public class L_0026_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 2, 4, 5, 9, 9};
        System.out.println(removeDuplicates1(arrays));
        System.out.println(removeDuplicates2(arrays));
    }

    public static int removeDuplicates1(int[] nums) {
        int len = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            while (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    i++;
                } else {
                    nums[len] = nums[i + 1];
                    len = len + 1;
                    break;
                }
            }
        }
        return len;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
