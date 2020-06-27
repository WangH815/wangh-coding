package com.wangh.base.yiibai.array;

import java.util.Arrays;

public class ArrayFilling {
    public static void main(String args[]) {
        int array[] = new int[6];
        Arrays.fill(array, 100);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.print(array[i]+",");
        }

        System.out.println("\n===========================");
        Arrays.fill(array, 3, 6, 99); // 从索引3到6使用数字99填充

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.print(array[i]+",");
        }
    }
}
