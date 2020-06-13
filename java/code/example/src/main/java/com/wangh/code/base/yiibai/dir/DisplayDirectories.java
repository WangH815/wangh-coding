package com.wangh.code.base.yiibai.dir;

import java.io.File;
import java.io.FileFilter;

public class DisplayDirectories {
    public static void main(String[] args) {
        File dir = new File("F:\\worksp\\javaexamples\\java_directories");
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length +" directories found.");

        if (files.length == 0) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i < files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }
}
