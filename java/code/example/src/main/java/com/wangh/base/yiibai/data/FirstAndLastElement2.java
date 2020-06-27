package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class FirstAndLastElement2 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("Bryant");
        lList.add("Curry");
        lList.add("James");
        lList.add("Maxsu");
        lList.add("Marry");
        System.out.println("First element is : " + lList.getFirst());
        System.out.println("Last element is : " + lList.getLast());
    }
}
