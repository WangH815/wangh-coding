package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class UpdatingLinkedList {
    public static void main(String[] a) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("Y");
        officers.add("I");
        officers.add("I");
        officers.add("B");
        officers.add("A");
        officers.add("I");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }
}
