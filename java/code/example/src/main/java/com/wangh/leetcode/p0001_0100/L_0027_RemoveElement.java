package com.wangh.leetcode.p0001_0100;

public class L_0027_RemoveElement {
    public static void main(String[] args) {
        int[] arrays = {2, 1, 2, 3};
        System.out.println(removeElement1(arrays, 2));
        System.out.println(removeElement2(arrays, 2));
    }

    public static int removeElement1(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
