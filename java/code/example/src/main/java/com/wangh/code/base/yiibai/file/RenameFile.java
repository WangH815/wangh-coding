package com.wangh.code.base.yiibai.file;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldName = new File("c:/tmp/java/test.txt");
        File newName = new File("c:/tmp/java/test121.txt");

        if (oldName.renameTo(newName)) {
            System.out.println("renamed");
        } else {
            System.out.println("Error");
        }
    }
}
