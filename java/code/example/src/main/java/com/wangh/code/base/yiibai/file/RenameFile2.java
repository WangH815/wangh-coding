package com.wangh.code.base.yiibai.file;

import java.io.File;

public class RenameFile2 {
    public static void main(String[] args) {
        File oldfile = new File("c:/tmp/java/test.txt");
        File newfile = new File("c:/tmp/java/test123.txt");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed succesful");
        } else {
            System.out.println("Rename failed");
        }
    }
}
