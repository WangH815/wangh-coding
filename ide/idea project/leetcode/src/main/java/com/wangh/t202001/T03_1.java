package com.wangh.t202001;

        import java.io.*;
        import java.nio.ByteBuffer;
        import java.nio.channels.ReadableByteChannel;
        import java.nio.channels.WritableByteChannel;

/**
 * 通过通道复制文件
 */
public class T03_1 {
    public static void main(String[] args) throws IOException {
        String inPath = "f:/CentOS-6.9-x86_64-bin-DVD2.iso";
        String outPath = "f:/CentOS-6.9-x86_64-bin-DVD2-1.iso";
        FileInputStream fis = new FileInputStream(inPath);
        FileOutputStream fos = new FileOutputStream(outPath);
        ReadableByteChannel tbc = fis.getChannel();
        WritableByteChannel wbc = fos.getChannel();
        copyData(tbc, wbc);
    }

    private static void copyData(ReadableByteChannel src, WritableByteChannel des) throws IOException {
        ByteBuffer bb = ByteBuffer.allocate(20 * 1024);
        while (src.read(bb) != -1) {
            bb.flip();
            while (bb.hasRemaining()) {
                des.write(bb);
            }
            bb.clear();
        }
    }
}
