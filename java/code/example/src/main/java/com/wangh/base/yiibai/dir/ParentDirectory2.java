package com.wangh.base.yiibai.dir;

import java.io.File;
import java.util.Scanner;

public class ParentDirectory2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filePath = scanner.next();
        File fileToTest = new File(filePath);

        if (!fileToTest.isDirectory()) {
            System.out.println("This is File");
            System.out.println("Parent Folder of this file is :" + fileToTest.getParent());
        } else {
            System.out.println("This is Directory");
            System.out.println("Parent Folder of this directory is :" + fileToTest.getParent());
        }
        scanner.close();
    }
}
