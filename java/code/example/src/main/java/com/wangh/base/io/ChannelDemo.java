package com.wangh.base.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 通道缓存读写步骤
 * 1.获取io流通道
 * 2.设置缓存
 * 3.通过通道读写数据
 */
public class ChannelDemo {
    private static String path = "data.txt";
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        // 文件写入
        FileChannel fileChannel = new FileOutputStream(path).getChannel();  // 通过文件输出流获取通道
        fileChannel.write(ByteBuffer.wrap("Some text\n".getBytes()));
        fileChannel.close();

        // 文件随机写入
        FileChannel fileChannel1 = new RandomAccessFile(path, "rw").getChannel();
        fileChannel1.position(fileChannel1.size());          // 游标移动到最后一位
        fileChannel1.write(ByteBuffer.wrap("Some more\n爱的".getBytes()));
        fileChannel1.close();

        // 文件读取
        FileChannel fileChannel2 = new FileInputStream(path).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BUFFER_SIZE);  // 设置字节缓存大小
        fileChannel2.read(byteBuffer);                             // 缓存从通道读取内容
        byteBuffer.flip();                                         // 游标移至第一位
        while (byteBuffer.hasRemaining()) {
            System.out.write(byteBuffer.get());
        }
        System.out.flush();
        fileChannel2.close();

        new File(path).delete();   // 所有通道关闭才能删除
    }
}
