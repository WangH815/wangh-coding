package com.wangh.code.util;

/**
 * @author WangH
 * @version 1.0
 */
public final class arrays {
    /**
     * 私有化构造器，确保不会被实例化
     */
    private arrays() {
    }

    /**
     * 随机整数数组生成器
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
     * 随机整数数组生成器
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
     * 打印整数数组
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
     * 打印单精度数组
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
}
