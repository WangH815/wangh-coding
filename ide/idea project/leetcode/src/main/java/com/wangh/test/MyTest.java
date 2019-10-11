package com.wangh.test;


import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyTest {

    public static void main(String[] args) throws IOException {
        int i = 12;
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 12:
                System.out.println("asdfasd");
                break;
            default:
                System.exit(1);
        }
        boolean bb = true;
        byte by = 127;
        int ii = 1;
        short ss = 11;
        char cc = 'a';
        float ff = 1.1f;
        double dd = 1.1d;
        long ll = 123L;
        System.out.println(by);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date())); //含有两个匿名类

        String str = "asdsdfas.abdfgsdrg";
        String pattern = ".*ab*";
        Pattern p = Pattern.compile(pattern);
//        System.out.println(p.);
        int a, b, c;
        float ffff = 2 << 29;
        System.out.println(ffff);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println((float) Integer.MAX_VALUE);
        System.out.println(((2 << 30) - 1));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("q：退出");
        do {
            c = (char) br.read();
            System.out.println(c);

        } while (c != 'q');
    }
}
