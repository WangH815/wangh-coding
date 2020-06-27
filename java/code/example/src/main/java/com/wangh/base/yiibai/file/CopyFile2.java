package com.wangh.base.yiibai.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        FileInputStream ins = null;
        FileOutputStream outs = null;
        try {
            File infile = new File("c:/tmp/java/test.txt");
            File outfile = new File("c:/tmp/java/outfile.txt");
            ins = new FileInputStream(infile);
            outs = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = ins.read(buffer)) > 0) {
                outs.write(buffer, 0, length);
            }
            ins.close();
            outs.close();
            System.out.println("File copied successfully!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
