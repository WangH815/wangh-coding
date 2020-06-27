package com.wangh.base.yiibai.dir;

import java.io.File;
import java.io.IOException;

public class HiddenDirectory2 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/worksp/javaexamples/java_directories/myfile.txt");
        if (file.isHidden()) {
            System.out.println("This file is hidden");
        } else {
            System.out.println("This file is not hidden");
        }
    }
}
