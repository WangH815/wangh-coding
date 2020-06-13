package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.io.IOException;

public class createFile {
   public static void main(String[] args) {
      try{
         File file = new File("c:/tmp/java/test.txt");
         if(file.createNewFile())
        	 System.out.println("Success!");
         else
        	 System.out.println("Error, file already exists.");
     }
     catch(IOException ioe) {
        ioe.printStackTrace();
     }
   }
}