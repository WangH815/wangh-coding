package com.wangh.code.base.yiibai.data;

import java.util.LinkedList;

public class ClearLinkedListElements2 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("10");
        lList.add("20");
        lList.add("30");
        lList.add("40");
        lList.add("50");
        System.out.println("LinkedList is : " + lList);
        lList.subList(2, 4).clear();
        System.out.println("LinkedList is : " + lList);
    }
}
