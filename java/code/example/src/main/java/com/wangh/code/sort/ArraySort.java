package com.wangh.code.sort;

public final class ArraySort {

    private ArraySort() {
    }


    // 冒泡排序
    public static void bubbleSort(int[] arrayInt) {
        int length = arrayInt.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (arrayInt[j - 1] > arrayInt[j]) {
                    int temp = arrayInt[j - 1];
                    arrayInt[j - 1] = arrayInt[j];
                    arrayInt[j] = temp;
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
                int tmp = arrayInt[father];
                arrayInt[father] = arrayInt[child];
                arrayInt[child] = tmp;
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
            int temp = intArray[0];
            intArray[0] = intArray[i];
            intArray[i] = temp;
            maxHeapDown(intArray, 0, i - 1);
        }
    }


    // 插入排序
    public static void insertSort(int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (intArray[j] < intArray[j - 1]) {
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
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


    // 快排
    public static void quickSort(int[] intArray, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int temp = intArray[i];
        while (i < j) {
            while (i < j && intArray[j] >= temp) {
                j--;
            }
            if (i < j) {
                intArray[i++] = intArray[j];
            }
            while (i < j && intArray[i] < temp) {
                i++;
            }
            if (i < j) {
                intArray[j--] = intArray[i];
            }
        }
        intArray[i] = temp;
        quickSort(intArray, low, i - 1);
        quickSort(intArray, i + 1, high);
    }


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


    // 选择排序
    public static void selectSort(int[] intArray) {
        int i;
        int j;
        int temp = 0;
        int flag = 0;
        for (i = 0; i < intArray.length; i++) {
            temp = intArray[i];
            flag = i;
            for (j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < temp) {
                    temp = intArray[j];
                    flag = j;
                }
            }
            if (flag != i) {
                intArray[flag] = intArray[i];
                intArray[i] = temp;
            }
        }
    }


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

}
