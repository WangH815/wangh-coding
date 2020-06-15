package com.wangh.code.base.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * Collection(I)包括List(I)和Set(I)
         * Map(I)
         */
        // List三个实现类ArrayList、Vector 和LinkedList
        List arrayList = new ArrayList();    // 数组实现，提供快速随机访问
        List vector = new Vector();          // 数组实现，线程安全;不推荐使用
        List linkedList = new LinkedList();  // 链表实现,可当作堆栈、队列和双向队列使用

        // Set主要有HashSet、TreeSet和LinkHashSet(基于HashSet+LinkedHashMap实现)
        Set hashSet = new HashSet();              // 散列表实现
        Set treeSet = new TreeSet();              // Integer、String可以默认排序;其他需要自定义排序方法
        Set linkedHashSet = new LinkedHashSet();

        // Map主要实现类HashMap、ConcurrentHashMap、Hashtable、TreeMap和LinkedHashMap
        Map hashMap = new HashMap();                                // 基于散列表+链表+红黑树,线程不安全
        Map hashMap1 = Collections.synchronizedMap(new HashMap());  // 线程安全
        Map concurrentHashMap = new ConcurrentHashMap();            // 支持并发的HashMap;线程安全
        Map hashTable = new Hashtable();                            // 线程安全;不推荐使用
        Map treeMap = new TreeMap();                                // 可排序Map;排序类似于TreeSet
        Map linkedHashMap = new LinkedHashMap();                    // 记录插入顺序的HashMap
    }
}
