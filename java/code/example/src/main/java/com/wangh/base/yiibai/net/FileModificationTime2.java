package com.wangh.base.yiibai.net;

import java.net.URL;
import java.net.URLConnection;

public class FileModificationTime2 {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://www.yiibai.com/static.v4/img/logo.png");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("The last modification time of logo.png is :" + timestamp);
    }
}
