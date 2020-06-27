package com.wangh.base.yiibai.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile2 {
    public static void main(String[] args) {
        try {
            String content = "Yiibai.com is one the best site in the world";
            File file = new File("c:/tmp/java/test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("All Job Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
