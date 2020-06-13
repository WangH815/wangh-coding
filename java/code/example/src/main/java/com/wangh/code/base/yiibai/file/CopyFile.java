package com.wangh.code.base.yiibai.file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        String srcfile = "c:/tmp/java/test.txt";
        String destnfile = "c:/tmp/java/test1.txt";
        BufferedWriter out1 = new BufferedWriter(new FileWriter(srcfile));
        out1.write("Line 1 : string to be copied\n");
        out1.write("Line 2 : to be copied\n");
        out1.close();
        InputStream in = new FileInputStream(new File(srcfile));
        OutputStream out = new FileOutputStream(new File(destnfile));
        byte[] buf = new byte[8*1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader(destnfile));
        String str;

        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
        in1.close();
    }
}
