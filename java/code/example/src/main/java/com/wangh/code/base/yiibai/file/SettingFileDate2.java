package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class SettingFileDate2 {
    public static void main(String[] args) {
        File f1 = new File("c:/tmp/java/test.txt");
        System.out.println("Before Format : " + f1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("After Format : " + sdf.format(f1.lastModified()));
    }
}
