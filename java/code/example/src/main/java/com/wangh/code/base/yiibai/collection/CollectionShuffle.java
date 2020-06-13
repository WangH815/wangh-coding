package com.wangh.code.base.yiibai.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionShuffle {
    public static void main(String[] argv) throws Exception {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");
        obj.add("F");
        Collections.shuffle(obj);
        System.out.println(obj);
    }
}
