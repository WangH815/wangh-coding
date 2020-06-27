package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("111");
        lList.add("222");
        lList.add("333");
        lList.add("444");
        lList.add("555");
        lList.add("999");
        System.out.println("First element of LinkedList is : " + lList.getFirst());
        System.out.println("Last element of LinkedList is : " + lList.getLast());
    }
}
