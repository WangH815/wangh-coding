package com.wangh.code.base.yiibai.data;

import java.util.Collections;
import java.util.Vector;

public class VectorBinary2 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Y");
        vec.add("I");
        vec.add("I");
        vec.add("B");
        vec.add("A");
        vec.add("I");

        Collections.sort(vec);
        System.out.println("Sorted Vector: " + vec);
        int found = Collections.binarySearch(vec, "I");
        System.out.println("Element found at : " + found);
    }
}
