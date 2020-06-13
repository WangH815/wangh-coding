package com.wangh.code.base.yiibai.dir;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DirectorySize {
    public static void main(String[] args) {
        String dir = "F:/worksp/javaexamples";
        long size = FileUtils.sizeOfDirectory(new File(dir));
        System.out.println("Size of " + dir + ": " + size + " bytes");
    }
}
