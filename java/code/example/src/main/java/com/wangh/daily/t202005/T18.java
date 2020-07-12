package com.wangh.daily.t202005;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class T18 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        int[] intArray = new int[30];
        intArrayGenerator(intArray, 100);

        System.out.println("原数组：");
        printIntArray(intArray);

        System.out.println("排序后数组：");
//        bubbleSort(intArray);
//        selectSort(intArray);
        insertSort(intArray);
        printIntArray(intArray);

        List<String> list = new LinkedList();

        list.add("Mahesh");
        list.add("Suresh");
        list.add("Ramesh");
        list.add("Naresh");
        list.add("Kalpesh");

        list.forEach(System.out::println);         // 方法引用
        System.out.println("=============");
        list.forEach((t) -> System.out.println(t)); // lambda表达式；等价于方法引用
    }


    // 生成 [1, rangge]之间的整数的数组
    static void intArrayGenerator(int[] intArray, int range) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new Random().nextInt(range) + 1;
        }
    }


    // 打印int数组
    static void printIntArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // 冒泡排序;核心在于比较相邻元素，大的往右(左)移动
    static void bubbleSort(int[] intArray) {
        int length = intArray.length;
        int tmp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }
    }


    // 选择排序;核心在于查找最值然后交换
    static void selectSort(int[] intArray) {
        int length = intArray.length;
        int min;
        int tmp;
        for (int i = 0; i < length - 1; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                // 获取最小值之索引
                if (intArray[min] > intArray[j]) {
                    min = j;
                }
            }
            if (i != min) {
                tmp = intArray[i];
                intArray[i] = intArray[min];
                intArray[min] = tmp;
            }
        }
    }


    // 插入排序;核心在于将数据插入有序数组中
    static void insertSort(int[] intArray) {
        int length = intArray.length;
        int tmp;
        for (int i = 0; i < length - 1; i++) {
            tmp = intArray[i + 1];
            int j = i + 1;
            // 将比待插入数据大的数据右移一位
            while (j > 0 && tmp < intArray[j - 1]) {
                intArray[j] = intArray[j - 1];
                j--;
            }

            // 插入数据
            if (j != i) {
                intArray[j] = tmp;
            }

        }

    }

}
