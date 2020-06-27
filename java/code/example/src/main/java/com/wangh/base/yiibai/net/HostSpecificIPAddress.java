package com.wangh.base.yiibai.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostSpecificIPAddress {
   public static void main(String[] args) {
      InetAddress address = null;
      try {
         address = InetAddress.getByName("www.yiibai.com");
      } catch (UnknownHostException e) {
         System.exit(2);
      }
      System.out.println(address.getHostName() + " IP is = " + address.getHostAddress());
      System.exit(0);
   }
}
