package com.wangh.code.base.yiibai.data;

import java.util.Collections;
import java.util.Vector;

public class VectorSwap2 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        Collections.swap(v, 0, 4);
        System.out.println("Result after swap Vector contains : " + v);
    }
}
