package com.wangh.base.yiibai.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateTemporaryFile {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("c:/tmp/java/test2", ".txt");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("temporary file created:");
        out.close();
    }
}
