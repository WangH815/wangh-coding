package com.wangh.base.yiibai.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class IterateThroughHashMap {
   public static void main(String[] args) {
      HashMap< String, String> hMap = new HashMap< String, String>();
      hMap.put("1", "1st");
      hMap.put("2", "2nd");
      hMap.put("3", "3rd");
      hMap.put("4", "4th");
      Collection<String> cl = hMap.values();
      Iterator<String> itr = cl.iterator();

      while (itr.hasNext()) {
         System.out.println(itr.next());
      }
   }
}
