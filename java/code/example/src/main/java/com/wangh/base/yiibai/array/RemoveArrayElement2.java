package com.wangh.base.yiibai.array;

import java.util.ArrayList;

public class RemoveArrayElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(220);
        arr.add(115);
        arr.add(320);
        arr.add(145);

        System.out.println("Size of list: " + arr.size());
        for (Integer number : arr) {
            System.out.println("Number = " + number);
        }
        arr.remove(2);

        System.out.println("After remove, Size of list: " + arr.size());

        for (Integer number : arr) {
            System.out.println("Number = " + number);
        }
    }
}