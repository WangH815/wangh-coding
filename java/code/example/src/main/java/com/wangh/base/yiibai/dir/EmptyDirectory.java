package com.wangh.base.yiibai.dir;

import java.io.File;

public class EmptyDirectory {
    public static void main(String[] args) {
        String dir = "F:/worksp/javaexamples/java_directories/dir11";
        File file = new File(dir);
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("The " + file.getPath() + " is not empty!");
                for(String str : files){
                    System.out.println("Exsits file: " + str);
                }
            }else{
                System.out.println("The " + file.getPath() + " is empty!");
            }

        }
    }
}
