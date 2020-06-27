package com.wangh.base.yiibai.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReversingCollection {
    public static void main(String[] args) {
        String[] coins = { "A", "B", "C", "D", "E" };
        List<String> l = new ArrayList<String>();

        for (int i = 0; i < coins.length; i++)
            l.add(coins[i]);
        ListIterator<String> liter = l.listIterator();
        System.out.println("Before reversal");

        while (liter.hasNext())
            System.out.println(liter.next());
        Collections.reverse(l);
        liter = l.listIterator();
        System.out.println("After reversal");
        while (liter.hasNext())
            System.out.println(liter.next());
    }
}
