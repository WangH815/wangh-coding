package com.wangh.base.yiibai.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLastModified {
    public static void main(String[] args) {
        File file = new File("c:/tmp/java/test.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String DateToStr = format.format(date);
        System.out.println(DateToStr);

    }
}
