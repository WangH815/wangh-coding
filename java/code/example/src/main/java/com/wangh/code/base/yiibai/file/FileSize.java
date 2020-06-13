package com.wangh.code.base.yiibai.file;

import java.io.File;

public class FileSize {
    public static long getFileSize(String filename) {
        File file = new File("c:/tmp/java/test1.txt");
        if (!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }

    public static void main(String[] args) {
        long size = getFileSize("c:/tmp/java/test1.txt");
        System.out.println("Filesize in bytes: " + size);
    }
}
