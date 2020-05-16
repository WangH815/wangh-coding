package com.wangh.t202005;

import java.io.*;

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
        }catch (Exception e){
            System.out.println(e);
        }
    }

    static void showDir(int indent, File file) throws IOException {
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

class MyThread extends Thread {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
