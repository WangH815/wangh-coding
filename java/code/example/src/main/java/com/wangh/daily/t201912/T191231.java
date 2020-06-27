package com.wangh.daily.t201912;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T191231 {
    private int i;
    private String str;
    private boolean b;

    public static void main(String[] args) {
        T191231 t1 = new T191231();
        System.out.println(t1.i);
        System.out.println(t1.str);
        System.out.println(t1.b);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));
        loop_out:
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            loop_inner:
            for (int j = 1; j < 10; j++) {
                if (j % 2 == 0) {
                    continue loop_out;
                }
                System.out.println(j);
            }
        }
        System.out.println(Integer.toBinaryString(60));
    }
}
