package com.wangh.code.base.yiibai.dir;

import java.io.File;

public class CreateDirectories {
    public static void main(String[] args) {
        String directories = "F:\\worksp\\javaexamples\\java_directories\\dir1\\dir12\\dir13";
        //String directories2 = "dir1\\dir12\\dir13";
        //String directories3 = "dir1/dir12/dir13";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
