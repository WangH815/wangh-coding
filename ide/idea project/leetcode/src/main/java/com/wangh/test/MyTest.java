package com.wangh.test;

import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        String str = new String("afasdfawef");
        String str1 = new String("afasdfawef");
        String str2 = "afasdfawef";
//        str.intern();
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        ArrayList arr = new ArrayList();
        arr.add("0");
        arr.add(0);
        arr.remove(new Integer(0));

    }
}
