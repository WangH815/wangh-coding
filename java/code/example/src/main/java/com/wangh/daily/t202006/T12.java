package com.wangh.daily.t202006;

import java.io.File;
import java.io.IOException;

public class T12 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1\\2\\3.txt");
        File p = new File(file.getParent());
        if (!p.exists()) {
//            p.mkdirs();
        }
        file.createNewFile();
    }
}
