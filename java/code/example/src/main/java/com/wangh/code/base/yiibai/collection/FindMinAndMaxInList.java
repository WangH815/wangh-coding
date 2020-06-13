package com.wangh.code.base.yiibai.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinAndMaxInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("11 111 22 333 444 55 666 77 8".split(" "));
        System.out.println(list);
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));
    }
}
