package com.wangh.code.base.yiibai.dir;

import java.io.File;
import java.io.IOException;

public class TraversingDirectory {
    public static void main(String[] argv) throws Exception {
        System.out.println("The Directory is traversed.");
        String dir = "F:/worksp/javaexamples/java_directories";
        File file = new File(dir);
        visitAllDirsAndFiles(file, 0);
    }

    static void visitAllDirsAndFiles(File file, int indent) throws IOException {
        for (int i = 0; i <= indent; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                visitAllDirsAndFiles(files[i], indent + 2);
        }
    }
}
