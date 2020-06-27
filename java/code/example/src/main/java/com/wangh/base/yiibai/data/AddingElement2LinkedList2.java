package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class AddingElement2LinkedList2 {
    public static final void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        System.out.println("Number of items in the list: " + lList.size());

        lList.add("www");
        lList.add("yiibai");
        lList.addFirst(".com");
        System.out.println(lList);
        lList.addLast("tutorials");
        System.out.println(lList);
        System.out.println("Number of items in the list: " + lList.size());
    }
}
