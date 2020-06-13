package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.util.Date;

public class SettingFileDate {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("c:/tmp/java/test.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
