package com.wangh.lintcode.p0001_0100;

public class L_0035_SearchInsertPosition {
    public static void main(String[] args) {

    }

    public static int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 0) {
            return 0;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        //目标值在不在当前停的位置的前边还是后边
        if (target > nums[start]) {
            return start + 1;
        }
        //如果小于的话，就返回当前位置，跑步超过第二名还是第二名，所以不用减 1。
        else {
            return start;
        }
    }

    public static int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 0) {
            return 0;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int searchInsert3(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        if (nums.length == 0) {
            return 0;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
