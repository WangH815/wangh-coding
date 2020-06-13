package com.wangh.code.base.yiibai.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1 2 3 4 5 6".split(" "));
        System.out.println("List :" + list);
        Collections.rotate(list, 2);;
        System.out.println("rotate: " + list);
    }
}
