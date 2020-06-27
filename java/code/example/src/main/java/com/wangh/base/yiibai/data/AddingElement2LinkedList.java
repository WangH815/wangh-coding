package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class AddingElement2LinkedList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);

        lList.addFirst("0");
        System.out.println(lList);

        lList.addLast("99");
        System.out.println(lList);
    }
}
