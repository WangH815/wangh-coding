package com.wangh.code.daily.t202005;

import com.wangh.code.sort.ArraySort;

import java.util.Arrays;

public class T25SortTest {
    public static void main(String[] args) {
        int[] intArray = randomArrayGenerator(100000, -50000, 50000);

        System.out.println("排序前：");
        arrayPrint(intArray);

        long timeStart = System.currentTimeMillis();

//        ArraySort.bubbleSort(intArray);
//        ArraySort.heapSort(intArray);
//        ArraySort.insertSort(intArray);
//        ArraySort.mergeSort(intArray, 0, intArray.length - 1 );
//        ArraySort.quickSort(intArray, 0, intArray.length - 1 );
//        ArraySort.radixSort(intArray);
//        ArraySort.selectSort(intArray);
//        ArraySort.shellSort(intArray);
        Arrays.sort(intArray);

        long timeEnd = System.currentTimeMillis();
        System.out.println("排序后：");
        arrayPrint(intArray);

        System.out.println("排序耗时：" + (timeEnd - timeStart) + "ms");

    }


    // 随机数组生成器
    private static int[] randomArrayGenerator(int length, int start, int end) {
        if (length < 1) {
            return null;
        }
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = (int) (Math.random() * (end - start)) + start;
        }
        return randomArray;
    }

    // 打印数组
    private static void arrayPrint(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return;
        }
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
