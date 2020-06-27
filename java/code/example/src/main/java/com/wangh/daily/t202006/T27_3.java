package com.wangh.daily.t202006;

import java.util.*;

public class T27_3 {
    public static void main(String[] args) {
        List fruit = new ArrayList();
        fruit.add(new Apple());
        fruit.add(new Orange());

        /**
         * List列表
         */
        List arrayList = new ArrayList();    // 数组列表
        List LinkedList = new LinkedList();  // 链表列表;可用于栈、队列和双端队列
        Vector vector = new Vector();        // 向量列表;线程安全
        Stack stack = new Stack();           // 栈列表;继承于Vector，线程安全

        /**
         * Queue 队列
         */
        Queue queue = new LinkedList();                     // 链表作为队列使用
        PriorityQueue priorityQueue = new PriorityQueue();  // 优先队列
        Deque deque = new ArrayDeque();                     // 双端队列;特殊的队列

        /**
         * Set集合
         */
        Set hashSet = new HashSet();         // 哈希集合
        Set treeSet = new TreeSet();         // 树集合

        /**
         * Map映射,核心思想为键值对key-value
         */
        Map hashMap = new HashMap();         // 哈希映射
        Map treeMap = new TreeMap();         // 树映射

        // Iterator迭代器
        Iterator iterator = arrayList.iterator();  // 支持集合框架内各类,只能单向移动
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        // ListIterator列表迭代器;Iterator的子类，只能由List容器获得
        ListIterator listIterator = LinkedList.listIterator();  // 支持双向移动
    }
}

class Apple {
}

class Orange {
}
