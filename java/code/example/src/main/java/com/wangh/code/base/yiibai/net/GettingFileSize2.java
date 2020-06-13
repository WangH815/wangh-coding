package com.wangh.code.base.yiibai.net;

import java.net.URL;
import java.net.URLConnection;

public class GettingFileSize2 {
    public static void main(String[] argv) throws Exception {
        int size;
        URL url = new URL("http://www.yiibai.com/downloads/yiibaidb.zip");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("file size is empty.");
        else
            System.out.println("File size is = " + size + " bytes");
        conn.getInputStream().close();
    }
}
