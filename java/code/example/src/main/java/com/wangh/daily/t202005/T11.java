package com.wangh.daily.t202005;

import java.util.Date;

public class T11 {
    public static void main(String[] args) {
        FreshJuice fj = new FreshJuice();
        System.out.println(fj.size);
        System.out.println(new Date());

        SonA sa = new SonA();

        System.out.println(new Byte("12"));
        System.out.println(new Short("12"));
        System.out.println(new Character((char) 33));
        System.out.println(new Character('\uffff'));
        System.out.println(new Integer(12));
        System.out.println(new Long(12));
        System.out.println(new Float(1.0));
        System.out.println(new Double(1.0));

        System.out.println("============");
//        System.out.println("0000_0000_0000_0000_0000_0000_0000_1100");
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(-1 >>> 1);
        System.out.println(1 << 31);
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1>>>1));

    }
}

class FreshJuice {
    enum FreshSize {
        SMALL, MEDIUM, LARGE
    }

    FreshSize size;
}

class SuperA {
    SuperA() {
        System.out.println("SuperA 构造器...");
    }

    static {
        System.out.println("SuperA Static...");
    }
}

class SonA extends SuperA {
    SonA() {
        System.out.println("SonA 构造器...");
    }

    static {
        System.out.println("SonA Static...");
    }
}
