package com.wangh.leetcode.p0001_0100;

public class L_0034_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {

    }

    public static int[] searchRange1(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        // 从左到右扫描
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetRange[0] = i;
                break;
            }
        }

        // 如果之前没找到，直接返回 [ -1 , -1 ]
        if (targetRange[0] == -1) {
            return targetRange;
        }

        //从右到左扫描
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                targetRange[1] = j;
                break;
            }
        }

        return targetRange;
    }

    public static int[] searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //考虑 tartget 是否存在，判断我们要找的值是否等于 target 并且是否越界
        if (start == nums.length || nums[start] != target) {
            return ans;
        } else {
            ans[0] = start;
        }
        ans[0] = start;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        ans[1] = end;
        return ans;
    }

    public static int[] searchRange3(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                int n = mid > 0 ? nums[mid - 1] : Integer.MIN_VALUE;
                if (target > n || mid == 0) {
                    ans[0] = mid;
                    break;
                }
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                int n = mid < nums.length - 1 ? nums[mid + 1] : Integer.MAX_VALUE;
                if (target < n || mid == nums.length - 1) {
                    ans[1] = mid;
                    break;
                }
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
