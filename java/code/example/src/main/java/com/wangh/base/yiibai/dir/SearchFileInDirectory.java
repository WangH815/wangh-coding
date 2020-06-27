package com.wangh.base.yiibai.dir;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFileInDirectory {
    public static void main(String[] args) {
        File dir = new File("F:/worksp/javaexamples/java_directories/src/com/yiibai");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith("D");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory: ");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
