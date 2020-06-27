package com.wangh.base.yiibai.net;

import java.net.InetAddress;

public class HostSpecificByIP {
   public static void main(String[] argv) throws Exception {
      InetAddress addr = InetAddress.getByName("www.yiibai.com");
      System.out.println("Host name is: "+addr.getHostName());
      System.out.println("Ip address is: "+ addr.getHostAddress());
   }
}
