package com.wangh.daily.t202005;

import com.wangh.util.Arrays;

import static com.wangh.sort.ArraySort.*;

public class T28 {
    public static void main(String[] args) {
        int[] intArray = Arrays.intArrayRandomGenerator(100000, -100000, 100000);
        Arrays.intArrayPrint(intArray);
        long start = System.currentTimeMillis();
//        insertSort(intArray);
//        Arrays.sort(intArray);
        shellSort(intArray
        );
        long end = System.currentTimeMillis();
        Arrays.intArrayPrint(intArray);
        System.out.println("排序耗时：" + (end - start) + "ms");

//        for (int i = 0; i < 10000; i++) {
//            TestSort ts = new TestSort();
//
//        }
    }
}

class TestSort {
    TestSort() {
        test();
//        System.out.println(this.toString());
    }

    public void test() {
        int[] intArray = Arrays.intArrayRandomGenerator(100, -100, 100);
//        long start = System.currentTimeMillis();
        quickSort(intArray, 0, intArray.length - 1);
//        long end = System.currentTimeMillis();
//        System.out.println("排序耗时：" + (end - start) + "ms");
        Arrays.intArrayPrint(intArray);
    }
}
