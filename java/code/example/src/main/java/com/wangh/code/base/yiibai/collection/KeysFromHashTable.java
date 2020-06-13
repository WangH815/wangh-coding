package com.wangh.code.base.yiibai.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class KeysFromHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        ht.put("4", "Four");
        ht.put("5", "Five");
        Enumeration<String> e = ht.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
