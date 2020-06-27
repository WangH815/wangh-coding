package com.wangh.base.yiibai.file;

import java.io.File;

public class FileExistence {
    public static void main(String[] args) {
        File file = new File("c:/tmp/java/test.txt");
        System.out.println(file.exists());
    }
}
