package com.wangh.base.yiibai.file;

import java.io.*;

public class AppendString2File {
    public static void main(String[] args) throws Exception {
        String filename = "c:/tmp/java/test.txt";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(filename));
            out.write("This is the first String1\n");
            out.close();
            out = new BufferedWriter(new FileWriter(filename, true));
            out.write("This is the second String2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            // 输出文件内容
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}
