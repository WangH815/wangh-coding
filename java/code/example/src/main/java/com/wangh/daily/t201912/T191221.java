package com.wangh.daily.t201912;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T191221 {


    public static void main(String[] args) throws IOException {
        double[] d1 = new double[]{1, 2, 3, 4, 5};
        double[] d2 = {6, 7, 8, 9, 10};
        double[] d3 = new double[5];

        for (double x : d1) {
            System.out.println(x);
        }
        for (double y : d2) {
            System.out.println(y);
        }

        System.out.println(new Date());
        System.out.println(new Date(99, 1, 3).after(new Date(99, 1, 2)));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date()));

        long start = System.currentTimeMillis();
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 2);
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        Calendar c = Calendar.getInstance();
        c.set(2016, 1, -10);
        System.out.println(c.get(Calendar.DATE));

        String str = "qwefsaomxcasodf.com.adsfasdf.com..asdad.sl";
        String pattern = ".*com.*";
        boolean isMatch = Pattern.matches(pattern, str);
        System.out.println(isMatch);

        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(\\D*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern1);

        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

        System.out.println(max(12, 14));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char cc;
        do {
            cc = (char)br.read();
            System.out.print(cc);
        }while(cc != 'q');

        File ff = new File("hello.txt");
        OutputStream os = new FileOutputStream(ff);
        byte[] bs = {'a','1','2','c'};
        os.write(bs);
        os.close();
    }

    public static int max(int x, int y) {
        return x >= y ? x : y;
    }
}
