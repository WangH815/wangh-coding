package com.wangh.base.yiibai.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("c:/tmp/java/test.txt"));
            out.write("This a String write to file.\n");
            out.close();
            System.out.println("File created and write successfully");
        } catch (IOException e) {
        }
    }
}