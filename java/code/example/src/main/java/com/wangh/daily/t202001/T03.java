package com.wangh.daily.t202001;

import java.util.HashSet;

public class T03 {
    int i = 121;
    String str = "sdfsd";

    public static void main(String[] args) throws CloneNotSupportedException {
        HashSet hs = new HashSet();
        hs.add(new Object());
        hs.add(new T03());
        System.out.println(hs.hashCode());

        for (Object o : hs) {
            System.out.println(o.hashCode());
            if (o instanceof T03)
                System.out.println(((T03) o).str);
        }
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("====================");
        CloneDemo c1 = new CloneDemo();
        CloneDemo c2 = new CloneDemo();
        CloneDemo c11 = (CloneDemo) c1.clone();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println("====================");
        System.out.println(c1.hashCode());
        System.out.println(c11.hashCode());
        System.out.println(c1.equals(c11));

    }
}

class CloneDemo implements Cloneable {
    //    int i;
//    String str;
//    CloneDemo(int i,String str){
//        this.i = i;
//        this.str = str;
//    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
