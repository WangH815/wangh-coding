package com.wangh.base.yiibai.dir;

import java.io.File;

public class DisplayFilesInDirectory2 {
    public static File folder = new File("F:\\worksp\\javaexamples\\java_directories");
    static String temp = "";

    public static void main(String[] args) {
        System.out.println("Reading files under the folder " + folder.getAbsolutePath());
        listFilesForFolder(folder);
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if (fileEntry.isFile()) {
                    temp = fileEntry.getName();
                    if ((temp.substring(temp.lastIndexOf('.')
                            + 1, temp.length()).toLowerCase()).equals("java")) System.out.println(
                            "" + folder.getAbsolutePath() + "\\" + fileEntry.getName());
                }
            }
        }
    }
}
