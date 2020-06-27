package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class UpdatingLinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("1");
        llist.add("2");
        llist.add("3");
        llist.add("4");
        llist.add("5");
        System.out.println("Original LinkedList contains : " + llist);
        llist.set(3, "666");
        System.out.println("Updated LinkedList contains : " + llist);
    }
}
