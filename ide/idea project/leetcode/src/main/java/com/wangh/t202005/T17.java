package com.wangh.t202005;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T17 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("t0517.txt",true));
//        new BufferedWriter(new OutputStreamWriter(new FileOutputStream("xx.txt"), "utf-8"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("t0517.txt",true));
        File f = new File("t0517.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.append("dasgfa23rds发光时代\n");
        bw.append("dasgfa23rds发光时代\n");
        bw.append("dasgfa23rds发光时代\n");
        bw.flush();
        System.out.println((f.getTotalSpace() >> 30) + "GB");  // 获取所在分区大小
        System.out.println((new File("E:\\Themes Pic.rar").length() >> 20) + "MB");

        String str1 = "1234fd";
        String str2 = "1234fd";
        String str3 = new String("1234fd");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        showDir(2, new File("f:\\git"));

        System.out.println(System.getProperty("user.dir"));

        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            new Input().method();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        List<String> myList = new LinkedList();
        myList.add("1");
        myList.add("a");
        myList.add("b");
        myList.add("2");
        myList.add("0");
        System.out.println(myList);

        System.out.println(mt.getName());

        final String str11 = "1234";
        System.out.println(str11.substring(2));

        int i = 1;
        int j = i;
        i = 11;
        System.out.println(j);

        Queue<String> qq = new LinkedList();
        qq.add(null);
        qq.add(null);
        qq.add("asdf");
        qq.add("1234");

        for(String str:qq){
            System.out.println(str);
        }
    }


    static void showDir(int indent, File file) throws IOException {
        final int ii;
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 2, files[i]);
        }
    }
}

/**
 * 创建线程类
 */
class MyThread extends Thread {
    /**
     * 重写run()方法
     */
    @Override
    public void run() {
        throw new RuntimeException();
    }
}


/**
 * 自定义异常测试
 */
class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}

class Input {
    void method() throws MyException {
        throw new MyException("My Exception");
    }
}

