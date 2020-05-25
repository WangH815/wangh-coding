package com.wangh.code.daily.t201912;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class T191224 {
    public static void main(String[] args) throws IOException {
        File f = new File("./");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        File ff = new File("./", "1");
        File ff1 = new File("./", "2");
        ff.createNewFile();
        ff1.mkdir();

        if (ff.isFile()) {
            ff.delete();
        }
        if (ff1.isDirectory()) {
            ff1.delete();
        }

        File[] ffs = new File("f:/").listFiles();
        String[] ffs1 = new File("f:/").list();
        for (File x : ffs) {
            System.out.println(x.getAbsolutePath());
        }
        System.out.println("==========================================");
        for (String str : ffs1) {
            System.out.println("f:\\" + str);
        }

        List<String> ls = new ArrayList<String>();
        ls.add("a");
        ls.add("b");
        System.out.println(ls.size());
        for (String y : ls) {
            System.out.println(y);
        }

        String[] strs = new String[ls.size()];
        ls.toArray(strs);

        Iterator<String> is = ls.iterator();
        while (is.hasNext()) {
            System.out.println(is.next());
        }

        Map<String, String> m = new HashMap<String, String>();
        m.put("a", "1");
        m.put("b", "2");
        m.put("c", "3");

        for (String z : m.keySet()) {
            System.out.println(m.get(z));
        }

        Iterator<Map.Entry<String, String>> it = m.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (it.hasNext()) {
            entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("====================================");
        for (Map.Entry<String, String> entry1 : m.entrySet()) {
            System.out.println(entry1.getKey() + ":" + entry1.getValue());
        }
    }
}
