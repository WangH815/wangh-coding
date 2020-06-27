package com.wangh.base.yiibai.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendString2File2 {
     public static void main( String[] args ) { 
          try { 
             String data = " yiibai.com is one of the best website in the world";
             File f1 = new File("c:/tmp/java/test.txt");
             if(!f1.exists()) {
                f1.createNewFile();
             } 
             FileWriter fileWritter = new FileWriter(f1.getName(),true);
             BufferedWriter bw = new BufferedWriter(fileWritter);
             bw.write(data);
             bw.close();
             System.out.println("Done");
          } catch(IOException e){
             e.printStackTrace();
          }
       }
}
