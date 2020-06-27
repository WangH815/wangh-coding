package com.wangh.base.yiibai.data;

import java.util.LinkedList;

public class GetLinkedListElements {
    private LinkedList<Object> list = new LinkedList<Object>();

    public void push(Object v) {
        list.addFirst(v);
    }

    public Object top() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        GetLinkedListElements stack = new GetLinkedListElements();
        for (int i = 10; i < 20; i++) {
            stack.push(new Integer(i));
        }

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
