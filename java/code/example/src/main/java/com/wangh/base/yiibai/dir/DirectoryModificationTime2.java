package com.wangh.base.yiibai.dir;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirectoryModificationTime2 { 
   public static void main(String[] args) { 
      File f1 = new File("F:/worksp/javaexamples/java_directories/");
      System.out.println("Before Format : " + f1.lastModified());
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      System.out.println("After Format : " + sdf.format(f1.lastModified()));
   } 
}
