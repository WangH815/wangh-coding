package com.wangh.util;

/**
 * @author WangH
 * @version 1.0
 * final确保不会有子类
 */
public final class Arrays {
    /**
     * 私有化构造器，确保不会被实例化
     */
    private Arrays() {
    }

    /**
     * 随机int数组生成器
     *
     * @param length 数组长度
     * @param min    数组元素最小值
     * @param max    数组元素最大值
     * @return int[]
     * @since 2020-05-27
     */
    public static int[] intArrayRandomGenerator(int length, int min, int max) {
        if (length < 1) {
            return null;
        }
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = (int) (Math.random() * (max - min)) + min;
        }
        return randomArray;
    }


    /**
     * 随机float数组生成器
     *
     * @param length 数组长度
     * @param min    数组元素最小值
     * @param max    数组元素最大值
     * @return int[]
     * @since 2020-05-27
     */
    public static float[] floatArrayRandomGenerator(int length, float min, float max) {
        if (length < 1) {
            return null;
        }
        float[] randomArray = new float[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = (float) (Math.random() * (max - min) + min);
        }
        return randomArray;
    }

    /**
     * 打印int数组
     *
     * @return 数组元素空格隔开
     */
    public static void intArrayPrint(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return;
        }
        for (int element : intArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * 打印float数组
     *
     * @return 数组元素空格隔开
     */
    public static void intArrayPrint(float[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return;
        }
        for (float element : intArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * int数组元素交换
     */
    public static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    /**
     * float数组元素交换
     */
    public static void swap(float[] intArray, int i, int j) {
        float temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

}
