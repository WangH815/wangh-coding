package com.wangh.sort;

public final class ArraySort {

    private ArraySort() {
    }

    /**
     * 冒泡排序
     *
     * @param intArray
     * @idea 数组相邻两数对比，将最值移动到一侧
     */
    public static void bubbleSort(int[] intArray) {
        int length = intArray.length;
        boolean flag = true;  // 用于判断数组是否有序
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                    flag = false;
                }
            }
            // 当前循环未发生交换说明剩余元素有序，则跳出循环
            if (flag) {
                break;
            }
        }
    }


    /**
     * 选择排序
     *
     * @param intArray
     * @idea 将游标位置（已排序后一位）与未排序中最值选择交换
     */
    public static void selectSort(int[] intArray) {
        int length = intArray.length;
        int min;         // 最小值
        int minIndex;
        for (int i = 0; i < length - 1; i++) {
            min = intArray[i];
            minIndex = i;
            // 查找未排序中最小值及其索引
            for (int j = i + 1; j < length; j++) {
                if (intArray[j] < min) {
                    min = intArray[j];  // min必须保持最小值
                    minIndex = j;
                }
            }
            // 游标位置元素不是最小值则交换
            if (minIndex != i) {
                intArray[minIndex] = intArray[i];
                intArray[i] = min;
            }
        }
    }


    /**
     * 插入排序
     *
     * @param intArray
     * @idea 将未排序的第一个元素插入有序序列中
     * 思路一：待插入元素与有序序列逐个比较，获取插入位置索引，右移索引右侧数据，然后插入元素
     * 思路二：待插入元素与有序序列左侧元素比较，待插入元素小的话则交换相邻元素
     */
    public static void insertSort(int[] intArray) {
        int length = intArray.length;

        for (int i = 1; i < length; i++) {  // intArray[0]为第一个有序序列
            int temp = intArray[i];   // 待插入数据
            int index = i;            // 有序序列中游标
            while (index > 0 && temp < intArray[index - 1]) {
                intArray[index] = intArray[index - 1];  // 元素右移
                index--;                                // 游标左移
            }
            intArray[index] = temp;   // 插入数据;可以加if(index != i);不加多一次赋值，加的话多一次判断
        }
    }

// 基于思路二实现，相对于思路一比较容易实现
//    public static void insertSort(int[] intArray) {
//        int length = intArray.length;
//        int temp;
//        for (int i = 1; i < length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (intArray[j] < intArray[j - 1]) {  //
//                    swap(intArray, j, j - 1);
//                }
//            }
//        }
//    }


    // 希尔排序
    public static void shellSort(int[] intArray) {
        int length = intArray.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < length; j += gap) {
                    if (intArray[j] < intArray[j - gap]) {
                        int temp = intArray[j];
                        int k = j;
                        while (k >= gap && intArray[k - gap] > temp) {
                            intArray[k] = intArray[k - gap];
                            k -= gap;
                        }
                        intArray[k] = temp;
                    }
                }
            }
        }
    }


    // 堆排序
    private static void maxHeapDown(int[] arrayInt, int start, int end) {
        int father = start;
        int child = 2 * father + 1;
        while (child <= end) {
            if (child < end && arrayInt[child] < arrayInt[child + 1]) {
                child++;
            }
            if (arrayInt[father] >= arrayInt[child]) {
                break;
            } else {
                swap(arrayInt, father, child);
            }
            father = child;
            child = 2 * father + 1;
        }
    }

    public static void heapSort(int[] intArray) {
        int i;
        int length = intArray.length;
        for (i = length / 2 - 1; i >= 0; i--) {
            maxHeapDown(intArray, i, length - 1);
        }
        for (i = length - 1; i > 0; i--) {
            swap(intArray, 0, i);
            maxHeapDown(intArray, 0, i - 1);
        }
    }


    // 归并排序
    private static void merge(int[] intArray, int start, int median, int end) {
        int i, j, k;
        int n1 = median - start + 1;
        int n2 = end - median;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = start; i < n1; i++, k++) {
            L[i] = intArray[k];
        }
        for (i = 0, k = median + 1; i < n2; i++, k++) {
            R[i] = intArray[k];
        }
        for (k = start, i = 0, j = 0; i < n1 && j < n2; k++) {
            if (L[i] < R[j]) {
                intArray[k] = L[i];
                i++;
            } else {
                intArray[k] = R[j];
                j++;
            }
        }
        while (i < n1) {
            intArray[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            intArray[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] intArray, int start, int end) {
        if (start < end) {
            int median = (start + end) / 2;
            mergeSort(intArray, start, median);
            mergeSort(intArray, median + 1, end);
            merge(intArray, start, median, end);
        }
    }


    /**
     * 快速排序
     *
     * @param
     * @idea 查找基准值需要排列的位置，左侧数据都不大于基准值，右侧数据都不小于基准值;然后再对左右侧数递归排序
     */
    public static void quickSort(int[] intArray, int left, int right) {
        if (left > right) {
            return;   // 递归返回条件
        }
        int pivot = intArray[left];   // 基准值
        int pivotIndex = left;        // 基准值索引
        int index = right;
        while (pivotIndex < index) {
            // 不小于基准值，右索引左移
            while (intArray[index] > pivot) {  // 这里pivotIndex < index条件可不加
                index--;
            }
            if (pivotIndex < index) {
                intArray[pivotIndex] = intArray[index];
                pivotIndex++;
            }

            // 小于基准值，左索引右移
            while (pivotIndex < index && intArray[pivotIndex] < pivot) {
                pivotIndex++;
            }
            if (pivotIndex < index) {
                intArray[index] = intArray[pivotIndex];
                index--;
            }
        }
        intArray[pivotIndex] = pivot;
        quickSort(intArray, left, pivotIndex - 1);
        quickSort(intArray, pivotIndex + 1, right);
    }


//    public static void quickSort(int[] intArray, int low, int high) {
//        if (low >= high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int temp = intArray[i];
//        while (i < j) {
//            while (i < j && intArray[j] >= temp) {
//                j--;
//            }
//            if (i < j) {
//                intArray[i++] = intArray[j];
//            }
//            while (i < j && intArray[i] < temp) {
//                i++;
//            }
//            if (i < j) {
//                intArray[j--] = intArray[i];
//            }
//        }
//        intArray[i] = temp;
//        quickSort(intArray, low, i - 1);
//        quickSort(intArray, i + 1, high);
//    }


    // 基数排序(有错误待处理)
    private static int getMax(int[] intArray) {
        int max = intArray[0];
        for (int i : intArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static void countSort(int[] intArray, int exp) {
        int[] output = new int[intArray.length];
        int[] buckets = new int[10];
        for (int anA : intArray) {
            buckets[(anA / exp) % 10]++;
        }
        for (int i : buckets)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i < 10; i++) {
            buckets[i] += buckets[i - 1];
        }
        for (int i : buckets)
            System.out.print(i + " ");
        System.out.println();
        for (int i = intArray.length - 1; i >= 0; i--) {
            output[buckets[(intArray[i] / exp) % 10] - 1] = intArray[i];
            buckets[(intArray[i] / exp) % 10]--;
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = output[i];
        }
        output = null;
        buckets = null;
    }

    public static void radixSort(int[] intArray) {
        int max = getMax(intArray);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(intArray, exp);
        }
    }


    /**
     * 数组元素交换
     */
    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

}
