package com.wangh.code.base.yiibai.data;

import java.util.LinkedList;

public class ClearLinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("11");
        lList.add("22");
        lList.add("33");
        lList.add("44");
        lList.add("55");
        System.out.println(lList);
        lList.subList(2, 4).clear();
        System.out.println(lList);
    }
}
