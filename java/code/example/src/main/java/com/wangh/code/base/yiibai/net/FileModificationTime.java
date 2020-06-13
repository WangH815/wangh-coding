package com.wangh.code.base.yiibai.net;

import java.net.URL;
import java.net.URLConnection;

public class FileModificationTime {
   public static void main(String[] argv)throws Exception {
      URL u = new URL("http://www.yiibai.com/favicon.ico");

      URLConnection uc = u.openConnection();
      uc.setUseCaches(false);
      long timestamp = uc.getLastModified();
      System.out.println("The last modification time of file is :"+timestamp);
   }
}
