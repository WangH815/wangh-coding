package com.wangh.code.base.yiibai.file;

import java.io.File;

public class DeleteFile2 {
    public static void main(String[] args) {
        try {
            File file = new File("c:/tmp/java/test.txt");
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}