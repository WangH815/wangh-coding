package com.wangh.base.yiibai.dir;

import java.io.File;

public class SearchingFiles {
    public static void main(String[] argv) throws Exception {
        File dir = new File("F:\\worksp\\javaexamples\\java_directories");
        String[] children = dir.list();

        if (children == null) {
            System.out.println("does not exist or  is not a directory");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
