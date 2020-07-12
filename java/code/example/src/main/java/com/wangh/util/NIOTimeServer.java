package com.wangh.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.CharBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Date;
import java.util.regex.Pattern;

public class NIOTimeServer {

    private static int port = 8125; // 端口
    private static Charset charset = Charset.forName("US-ASCII"); // 指定字符集
    private static CharsetEncoder encoder = charset.newEncoder(); // 字符集编码器

    private static ServerSocketChannel setup() throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open(); // 打开通道
        String host = InetAddress.getLocalHost().getHostAddress(); // 主机地址
        System.out.println("Listen at Host:" + host + ", port:" + port);
        InetSocketAddress isa = new InetSocketAddress(host, port);
        ssc.socket().bind(isa); // 绑定主机端口
        return ssc;
    }

    private static void serve(ServerSocketChannel ssc) throws IOException {
        SocketChannel sc = ssc.accept(); // 获取连接
        try {
            String now = new Date().toString();
            sc.write(encoder.encode(CharBuffer.wrap(now + "\r\n")));
            System.out.println(sc.socket().getInetAddress() + " : " + now);
            sc.close();
        } finally {
            // Make sure we close the channel (and hence the socket)
            sc.close();
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.err.println("Usage: java TimeServer [port]");
            return;
        }

        if ((args.length == 1) && Pattern.matches("[0-9]+", args[0])) {
            port = Integer.parseInt(args[0]);
        }

        ServerSocketChannel ssc = setup();
        while (true) {
            serve(ssc);
        }

    }

}
