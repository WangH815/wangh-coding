package com.wangh.base.yiibai.file;

import java.io.File;

public class Main {
    public static void main(String[] args)
            throws Exception {
        File file = null;
        File dir = new File("c:/tmp/java/");
        file = File.createTempFile("test", ".txt", dir);
        System.out.println(file.getPath());
    }
}
