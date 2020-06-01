package com.wangh.code.daily.t202005;

import java.util.Arrays;

import static com.wangh.code.util.Arrays.intArrayPrint;
import static com.wangh.code.util.Arrays.intArrayRandomGenerator;

public class T25SortTest {
    public static void main(String[] args) {
        int[] intArray = intArrayRandomGenerator(100000, -50000, 50000);

        System.out.println("排序前：");
        intArrayPrint(intArray);

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
        intArrayPrint(intArray);

        System.out.println("排序耗时：" + (timeEnd - timeStart) + "ms");

    }

}
