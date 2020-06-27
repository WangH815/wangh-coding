package com.wangh.base.yiibai.net;

import java.net.URL;

public class PartsOfURL {
    public static void main(String[] args) throws Exception {
        String webUrl = "http://www.yiibai.com/javaexamples/index.html";
        URL url = new URL(webUrl);
        System.out.println("URL is " + url.toString());
        System.out.println("protocol is " + url.getProtocol());
        System.out.println("file name is " + url.getFile());
        System.out.println("host is " + url.getHost());
        System.out.println("path is " + url.getPath());
        System.out.println("port is " + url.getPort());
        System.out.println("default port is " + url.getDefaultPort());
    }
}