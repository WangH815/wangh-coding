package com.wangh.code.base.yiibai.data;

import java.util.LinkedList;

public class SearchingLinkedList2 {
    public static void main(String args[]) {
        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        linkedlist1.add(001);
        linkedlist1.add(002);
        linkedlist1.add(003);
        linkedlist1.add(004);
        linkedlist1.add(005);
        linkedlist1.add(003);
        System.out.println("First index of 004 is : " + linkedlist1.indexOf(004));
        System.out.println("Last index of 004 is : " + linkedlist1.lastIndexOf(004));
    }
}
