package com.wangh.base.yiibai.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection2Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("IT ");
        list.add("tutorials ");
        list.add("website. ");
        String[] s1 = list.toArray(new String[0]);

        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}
