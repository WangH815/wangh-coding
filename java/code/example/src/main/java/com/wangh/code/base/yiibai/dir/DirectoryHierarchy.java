package com.wangh.code.base.yiibai.dir;

import java.io.File;
import java.io.IOException;

public class DirectoryHierarchy {
    public static void main(String[] a) throws IOException {
        showDir(1, new File("D:\\Maven"));
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i <= indent; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 2, files[i]);
        }
    }
}
