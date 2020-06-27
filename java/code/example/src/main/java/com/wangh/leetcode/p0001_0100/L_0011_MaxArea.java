package com.wangh.leetcode.p0001_0100;

public class L_0011_MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea1(new int[]{1, 5, 8, 9, 3, 9}));
        System.out.println(maxArea2(new int[]{1, 5, 8, 9, 3, 9}));
    }

    public static int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                if (h * (j - i) > max) {
                    max = h * (j - i);
                }
            }
        }
        return max;
    }

    public static int maxArea2(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

}
