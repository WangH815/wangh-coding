package com.wangh.daily.t202005;

import java.io.IOException;
import java.util.*;

public class T15 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - start) + "ms");

        System.out.println(1 > 2 ? true : false);
        System.out.println();

        loop1:
        for (int i = 0; i < 5; i++) {
            loop2:
            for (int j = 0; j < 5; j++) {
//                if (i > j)
//                    break loop2;
                System.out.println(Integer.toString(i) + Integer.toString(j));
            }
        }

        List<Integer> lists = new ArrayList<>();
        lists.add(99);
        lists.add(99);
        lists.add(128);
        lists.add(128);
        lists.add(-128);
        lists.add(-128);

        Integer[] is = new Integer[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            is[i] = lists.get(i);
        }

        for (int i = 0; i < lists.size() / 2; i++) {
            System.out.println(is[2 * i] == (is[2 * i + 1]));  // [-128,127]返回true
        }

        String str = new String();
        str = null;

        System.out.println(str);

//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');

        Set<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("b");
        hs.add("d");
        hs.add("e");
        hs.add("f");

        Iterator<String> iter_hs = hs.iterator();

        while (iter_hs.hasNext()) {
            System.out.print(iter_hs.next() + " ");
        }
        System.out.println();

        for (String str1 : hs) {
            System.out.print(str1 + " ");
        }
        System.out.println();

        Number nn = new Integer(12);
        System.out.println(nn);

        int[] iis = {1, 5, 1, 7, 9, 1, 98, 0, 3, 456, 9, 23, 8};
        System.out.println(Arrays.toString(iis));
        Arrays.sort(iis);
        System.out.println(Arrays.toString(iis));
    }

}
