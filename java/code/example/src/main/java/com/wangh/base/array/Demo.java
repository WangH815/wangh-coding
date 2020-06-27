package com.wangh.base.array;

import java.util.Arrays;

/**
 * 数组示例，这里以 int数组为例
 */
public class Demo {
    public static void main(String[] args) {
        // 声明
        int[] intArray = {6, 1, 8, 2, 5};
        int[] intArray1 = new int[]{6, 1, 60, 3};
        int[] intArray2 = new int[5];           // 声明指定长度的数组


        // 常用方法
        int length = intArray.length;           // 数组长度
        int[] intArray3 = intArray.clone();     // 复制数组;新数组操作不影响原数组
        int[] intArray4 = new int[intArray.length];
        System.arraycopy(intArray, 0, intArray4, 0, intArray.length);  // 复制数组,效率比clone()高
        Arrays.sort(intArray);                  // 排序;Arrays是数组的一个工具类
        Arrays.binarySearch(intArray, 2);  // 二分查找,要求数组有序

    }
}
