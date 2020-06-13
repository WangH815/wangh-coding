package com.wangh.code.base.yiibai.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String args[]) {
        String a[] = { "y", "i", "i" };
        String b[] = { "b", "a", "i" };
        List<String> arrayList = new ArrayList<String>(Arrays.asList(a));
		List<String> list = arrayList;
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}