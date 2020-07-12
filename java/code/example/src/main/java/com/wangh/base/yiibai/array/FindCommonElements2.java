package com.wangh.base.yiibai.array;

public class FindCommonElements2 {
    public static void main(String a[]) {
        int[] arr1 = {14, 17, 13, 19, 12};
        int[] arr2 = {13, 12, 112, 19, 400, 32, 14};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
