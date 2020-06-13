package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.io.IOException;

public class CreateTemporaryFile2 {
    public static void main(String[] args) {
        try {
            File f1 = File.createTempFile("c:/tmp/java/test", ".txt");
            System.out.println("Temp file : " + f1.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
