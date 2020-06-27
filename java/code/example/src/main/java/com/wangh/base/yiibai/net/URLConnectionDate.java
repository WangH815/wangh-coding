package com.wangh.base.yiibai.net;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URLConnectionDate {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.yiibai.com");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();
        if (date == 0) {
            System.out.println("No date information.");
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss ");
            System.out.println("It is now : " + formatter.format(new Date(date)));
        }
    }
}