package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class SearchingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("11");
        lList.add("22");
        lList.add("33");
        lList.add("44");
        lList.add("66");
        lList.add("22");
        lList.add("12");

        System.out.println("First index of 22 is:" + lList.indexOf("22"));

        System.out.println("Last index of 22 is:" + lList.lastIndexOf("22"));
    }
}
