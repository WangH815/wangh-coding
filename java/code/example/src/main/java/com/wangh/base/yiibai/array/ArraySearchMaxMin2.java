package com.wangh.base.yiibai.array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySearchMaxMin2 {
    public static void main(String[] args) {
        Integer[] numbers = {18, 22, 7, 15, 40, 19, 25};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
