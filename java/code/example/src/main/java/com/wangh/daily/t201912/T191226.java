package com.wangh.daily.t201912;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T191226 {
    public static void main(String[] args) throws IOException {
        Map<String, String> m = new HashMap<String, String>();
        for (int i = 0; i < 100000; i++) {
            m.put(i + "", i + "");
        }

        //通过key获取value循环
        for (String z : m.keySet()) {
            System.out.println(m.get(z));
        }
        System.out.println("====================================");

        //直接通过value循环
        for (String p : m.values()) {
            System.out.println(p);
        }
        System.out.println("====================================");

        //entry迭代器循环
        long t1 = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> it = m.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (it.hasNext()) {
            entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        long t2 = System.currentTimeMillis();
        System.out.println("====================================");

        //
        long t3 = System.currentTimeMillis();
        for (Map.Entry<String, String> entry1 : m.entrySet()) {
            System.out.println(entry1.getKey() + ":" + entry1.getValue());
        }
        long t4 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(t4 - t3);

        Integer[] ia = {1, 2, 3, 4};
        String[] sa = {"as", "asd", "sjk"};
        Character[] ca = {'p', 'i', 'r'};
        Double[] da = {1.2, 3.6, 8.7};
        myPrint(ia);
        myPrint(sa);
        myPrint(ca);
        myPrint(da);
    }

    public static <E> void myPrint(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print(e);
        }
        System.out.println();
    }
}
