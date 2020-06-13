package com.wangh.code.base.yiibai.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("c:/tmp/java/test.txt"))) {

            String sCurrentLine = null;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
