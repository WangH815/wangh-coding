package com.wangh.daily.t202007;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class T12 {
    private static String path = "data.txt";
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        // 文件写入
        FileChannel fileChannel = new FileOutputStream(path).getChannel();
        fileChannel.write(ByteBuffer.wrap("Some text\n".getBytes()));

        // 文件随机写入
        FileChannel fileChannel1 = new RandomAccessFile(path, "rw").getChannel();
        fileChannel1.position(fileChannel.size());
        fileChannel1.write(ByteBuffer.wrap("Some more\n".getBytes()));

        // 文件读取
        FileChannel fileChannel2 = new FileInputStream(path).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BUFFER_SIZE);  // 设置字节缓存大小
        fileChannel2.read(byteBuffer);                             // 缓存从通道读取内容
        byteBuffer.flip();                                         // 游标移至第一位
        while (byteBuffer.hasRemaining()) {
            System.out.write(byteBuffer.get());
        }
        System.out.flush();

    }
}
