package com.wangh.test;

import java.io.*;

public class T191222 {

    public static void main(String[] args) throws IOException {
        File ff = new File("hello.txt");
        OutputStream os = new FileOutputStream(ff);
        byte[] bs = {'0', '1', '2', '3'};
        os.write(bs);
        os.close();

        BufferedReader br = new BufferedReader(new FileReader(ff));  //读取缓冲
        System.out.println(br.readLine());                           //读取数据

    }

}
