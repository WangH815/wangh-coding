package com.wangh.t201912;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class T191227 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u1);
        System.out.println(u2);

        Manger m1 = new Manger();
        Manger m2 = new Manger();
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1);
        System.out.println(m2);

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        Integer i1 = -129;
        Integer i2 = -129;
        Integer i3 = -128;
        Integer i4 = -128;
        Integer i5 = 127;
        Integer i6 = 127;
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i5 == i6);
        System.out.println(i7 == i8);
    }
}

class User {
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}

class Manger {
    private int age;
}
