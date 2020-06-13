package com.wangh.code.base.yiibai.data;

import java.util.LinkedList;

public class GetLinkedListElements2 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println("LinkedList is : ");
        for (int i = 0; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }
    }
}
