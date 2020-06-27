package com.wangh.base.yiibai.net;

import java.net.URL;

public class PartsOfURL2 {
   public static void main(String args[]) throws Exception {
      URL u = new URL("http://www.yiibai.com");
      System.out.println("The URL is " + u);
      System.out.println("The file part is " + u.getFile());
      System.out.println("host is " + u.getHost());
      System.out.println("path is " + u.getPath());
      System.out.println("port is " + u.getPort());
      System.out.println("default port is " + u.getDefaultPort());
   }
}
