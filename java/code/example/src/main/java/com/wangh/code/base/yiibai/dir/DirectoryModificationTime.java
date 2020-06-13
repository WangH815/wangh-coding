package com.wangh.code.base.yiibai.dir;

import java.io.File;
import java.util.Date;

public class DirectoryModificationTime {
   public static void main(String[] args) {
      File file = new File("F:/worksp/javaexamples/java_directories/");
      System.out.println("last modifed:" + new Date(file.lastModified()));
   }
}
