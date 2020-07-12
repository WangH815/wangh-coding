package com.wangh.base.yiibai.array;

import java.util.Arrays;

public class ArraySortCompare {
    public static void main(String args[]) throws Exception {
        int array[] = {12, 15, -2, 16, -3, 28, 10, -7, -9, 24};
        Arrays.sort(array);
        printArray("Sorted array", array);

        int index = Arrays.binarySearch(array, 2);
        System.out.println("Found 2 @ " + index);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
