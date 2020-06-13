package com.wangh.code.base.yiibai.file;

import java.io.*;

public class DeleteFile {
    public static void main(String[] args) { 
     String filename  = "c:/tmp/java/test.txt";
      try {
         BufferedWriter out = new BufferedWriter (new FileWriter(filename));
         out.write("aString1\n");
         out.close();
         boolean success = (new File(filename)).delete();

         if (success) {
            System.out.println("The file has been successfully deleted"); 
         }
         BufferedReader in = new BufferedReader(new FileReader(filename));
         String str;

         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         in.close();
      }catch (IOException e) {
         System.out.println("exception occoured"+ e);
         System.out.println("File does not exist or you are trying to read a file that has been deleted");
      }
   }
}
