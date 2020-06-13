package com.wangh.code.base.yiibai.file;

import java.io.File;

public class FilePathComparison {
    public static void main(String[] args) {
        File file1 = new File("c:/tmp/java/test.txt");
        File file2 = new File("c:/tmp/java/test.txt");

        if (file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }
    }
}