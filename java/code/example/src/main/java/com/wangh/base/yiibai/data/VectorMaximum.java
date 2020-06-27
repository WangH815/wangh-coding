package com.wangh.base.yiibai.data;

import java.util.Collections;
import java.util.Vector;

public class VectorMaximum {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<Double>();
        v.add(new Double("13.1234"));
        v.add(new Double("13.332"));
        v.add(new Double("13.1342"));
        v.add(new Double("13.349"));
        v.add(new Double("12.321"));
        Object obj = Collections.max(v);
        System.out.println("The max element is:" + obj);
    }
}
