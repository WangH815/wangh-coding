package com.wangh.code.daily.t202005;

import java.text.DateFormat;
import java.util.*;

public class T12 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        String[] strs = new String[]{"a", "b", "1", "2"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        for (String str : strs) {
            System.out.println(str);
        }

        Set<String> hs = new HashSet();
        for (int i = 0; i < 10; i++) {
            hs.add(Integer.toString(i));
        }
        for (String str : hs) {
            System.out.println(str);
        }
        System.out.println("=================");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        for (int j = 0; ; j++) {
//            System.out.println(new Date());
//            Thread.sleep(1000);
//            if (j == 10)
//                break;
//        }
//        while (true) {
//            System.out.println(new Date());
//            Thread.sleep(1000);
//        }

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));

        System.out.println(Calendar.getInstance().getTime());
        Vector<String> v = new Vector();
        v.add("a");
        v.add("1");
        v.add("r");
        v.add("g");

        for (String str : v) {
            System.out.println(str);
        }

        DateFormat[] df = new DateFormat[6];

    }
}

