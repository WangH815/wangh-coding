package com.wangh.base.yiibai.net;

import java.net.*;
import java.util.Properties;

public class FindProxySettings {
    public static void main(String s[]) throws Exception {
        try {
            Properties systemSettings = System.getProperties();
            systemSettings.put("proxySet", "true");
            systemSettings.put("http.proxyHost", "proxy.yiibai.local");
            systemSettings.put("http.proxyPort", "80");

            URL u = new URL("http://www.google.com");
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            System.out.println(con.getResponseCode() + " : " + con.getResponseMessage());
            System.out.println(con.getResponseCode() == HttpURLConnection.HTTP_OK);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(false);
        }
        System.setProperty("java.net.useSystemProxies", "true");
        Proxy proxy = (Proxy) ProxySelector.getDefault().select(new URI(
                "http://www.baidu.com/")).iterator().
                next();
        ;
        System.out.println("proxy hostname : " + proxy.type());
        InetSocketAddress addr = (InetSocketAddress) proxy.address();

        if (addr == null) {
            System.out.println("No Proxy");
        } else {
            System.out.println("proxy hostname : " + addr.getHostName());
            System.out.println("proxy port : " + addr.getPort());
        }
    }
}
