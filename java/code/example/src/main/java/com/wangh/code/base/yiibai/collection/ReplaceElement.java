package com.wangh.code.base.yiibai.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("11 22 33 44 55 66 11 33 44 33".split(" "));
        System.out.println("List :" + list);
        Collections.replaceAll(list, "33", "888");
        System.out.println("replaceAll: " + list);
    }
} 