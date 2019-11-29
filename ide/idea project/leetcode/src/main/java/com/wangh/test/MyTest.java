package com.wangh.test;


import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
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
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("q：退出");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//
//        } while (c != 'q');

        String line = "aacbdsdfaaerrpp";     //待测试文本
        String reg = "rr";                   //正则表达式
        Pattern pat = Pattern.compile(reg);  //创建Pattern(模式组)对象;正则表达式编译对象
        Matcher mat = pat.matcher(line);     //创建Matcher(捕获组)对象;正则处理后对象
        if (mat.find()) {
            System.out.println(mat.group());
        }

        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattie cat";
        Pattern pp = Pattern.compile(REGEX);
        Matcher mm = pp.matcher(INPUT);
        int count = 0;
        while (mm.find()) {
            count++;
            System.out.println("count:" + count);
            System.out.print(mm.start() + "\t");
            System.out.println(mm.end());
        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str1;
//        do{
//            str1 = br.readLine();
//            System.out.println(str);
//        }while(!str.equals("end"));

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("1.txt"), "UTF-8");
        osw.append("sdfasdf安慰");
        osw.close();

//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNext()){
//            String str2 = sc.next();
//        }

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for (String x : list) {
            System.out.println(x);
        }

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("==============================");
        list.iterator().forEachRemaining(ele -> System.out.println(ele));
        System.out.println("==============================");

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String str11 : strArray) {
            System.out.println(str11);
        }

        Map<String, String> map = new HashMap<>();

        map.put("1", "v1");
        map.put("2", "v2");
        map.put("3", "v3");
        map.put("4", "v4");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for (String asdfa : map.values()) {
            System.out.println(asdfa);
        }

        myPrint(new Integer[]{1, 2, 3});
        myPrint(new String[]{"a", "b", "c"});
        myPrint(new Double[]{1d, 2d, 3d});

        Set<String> hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        Iterator<String> iHashSet = hashSet.iterator();
        while (iHashSet.hasNext()) {
            System.out.println(iHashSet.next());
        }

        Runnable r = () -> {
            System.out.println("123");
        };

        Thread t = new Thread(r);
        t.start();

    }

    static <E> void myPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s\t", element);
        }
        System.out.println();
    }

    interface myInterface {

    }
}

class MyThread implements Runnable {
    public void run() {
        System.out.println("MyThread");
    }
}