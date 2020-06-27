package com.wangh.base.yiibai.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExistence2 {
   public static void main(String[] args) throws IOException {
      File f = new File(System.getProperty("c:/tmp/java/")+"test.txt");
      System.out.println(f.exists()+f.getAbsolutePath());

      if(!f.getParentFile().exists()){
         f.getParentFile().mkdirs();
      } 
      if(!f.exists()){
         try {
            f.createNewFile();
         } catch (Exception e) {
            e.printStackTrace();
         } 
      } 
      try {
         File dir = new File(f.getParentFile(), f.getName());
         PrintWriter pWriter = new PrintWriter(dir);
         pWriter.print("writing anything...");
         pWriter.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } 
   }
}
