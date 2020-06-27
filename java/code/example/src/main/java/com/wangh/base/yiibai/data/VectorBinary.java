package com.wangh.base.yiibai.data;

import java.util.Collections;
import java.util.Vector;

public class VectorBinary {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Y");
        v.add("I");
        v.add("I");
        v.add("B");
        v.add("A");
        v.add("I");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "I");
        System.out.println("Element found at : " + index);
    }
}
