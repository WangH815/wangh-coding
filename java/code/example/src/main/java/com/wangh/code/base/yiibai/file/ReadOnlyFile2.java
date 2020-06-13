package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFile2 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/tmp/java/test.txt");
        file.setReadOnly();

        if (file.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }
        file.setWritable(true);
        if (file.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }
    }
}

