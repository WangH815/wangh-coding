package com.wangh.base.yiibai.data;

import java.util.Collections;
import java.util.Vector;

public class VectorMaximum2 {
    public static void main(String[] args) {
        Vector<Double> vec = new Vector<Double>();
        vec.add(new Double("14.142"));
        vec.add(new Double("15.132"));
        vec.add(new Double("12.142"));
        vec.add(new Double("17.139"));
        vec.add(new Double("13.134"));
        Object object1 = Collections.max(vec);
        System.out.println("Maximum Element is : " + object1);
    }
}
