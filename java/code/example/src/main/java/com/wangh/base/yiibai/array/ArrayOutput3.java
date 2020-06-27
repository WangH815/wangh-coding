package com.wangh.base.yiibai.array;

import java.util.Arrays;

public class ArrayOutput3 {
    public static void main(String[] args) {
        String[][] deepArr = new String[][] { { "Max", "Min" },
                { "Sum", "Avg" } };
        System.out.println(Arrays.toString(deepArr));
        System.out.println(Arrays.deepToString(deepArr));
    }
}
