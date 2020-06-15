package com.wangh.code.base.io;

import java.io.*;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Demo {
    public static void main(String[] args) throws IOException {
        /**
         * IO包括字节流和字符流
         * 字节流包括InputStream(输入流)和OutputStream(输出流)
         * 字符流包括Reader(读取流)和Writer(写入流)
         */
        File file = new File("file.txt");
        InputStream fileInputStream = new FileInputStream(file);
        OutputStream fileOutputStream = new FileOutputStream(file);
        Reader fileReader = new FileReader(file);
        Writer fileWriter = new FileWriter(file);


        /**
         * nio(non-blocking io/new io)
         * 核心概念Channel(通道)，Buffer(缓冲), Selector(选择器)
         */

        /**
         * Channel(通道)
         * 与io中的流同一级别,流是单向的，而通道是双向的
         *
         * 常用通道
         * FileChannel           // 文件IO
         * DatagramChannel       // UDP
         * SocketChannel         // TCP Client
         * ServerSocketChannel   // TCP Server
         */
        FileChannel fileChannel;
        DatagramChannel datagramChannel;
        SocketChannel socketChannel;
        ServerSocketChannel serverSocketChannel;

        /**
         * Buffer(缓冲)
         * 连续数据数组的一个容器,从通道(文件或网络)读写文件
         *
         * ByteBuffer
         * IntBuffer
         * CharBuffer
         * LongBuffer
         * DoubleBuffer
         * FloatBuffer
         * ShortBuffer
         */

        /**
         * Selector(选择器)
         * NIO 的核心类，Selector 能够检测多个注册的通道上是否有事件以便进行相应的响应处理
         */
    }

}
