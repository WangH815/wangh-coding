package com.wangh.util;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class IOs {
    private IOs() {
    }

    /**
     * Console读取
     *
     * @throws IOException
     */
    public static void readCharByConsole() throws IOException {
        //字符缓冲流，由字符输入流初始化
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按：'q'退出");
        char c;
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    public static void readLineByConsole() throws IOException {
        //字符缓冲流，由字符输入流初始化
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符串，按：'end'退出");
        String str = null;
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }


    // 字节流读写，这种方式有乱码
    public static void myWriteRead(String dir) throws IOException {
        File f = new File(dir);
        if (!f.exists()) {
            f.createNewFile();
        }
        byte[] bWrite = {12, 23, 64, 7, 13, 2, 7, 1};
        OutputStream fos = new FileOutputStream(f);  //输出流/写入流
        for (int i = 0; i < bWrite.length; i++) {
            fos.write(bWrite[i]);  //字节流写入
        }
        fos.close();

        InputStream fis = new FileInputStream(f);
        for (int i = 0; i < fis.available(); i++) {
            System.out.print((byte) fis.read() + " ");
        }
        System.out.println();
        fis.close();
    }

    // 字节流读写
    public static void myWriteRead1(String dir) throws IOException {
        File f = new File(dir);
        if (!f.exists()) {
            f.createNewFile();
        }
        OutputStream fos = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        for (int i = 0; i < 2000000; i++) {
            osw.append("asdfasdfawangs未加载更多粉丝" + i + "\n");
        }
        osw.close();
        fos.close();
        System.out.println("写入成功...");

//		InputStream fis = new FileInputStream(f);
//		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//		StringBuffer sb = new StringBuffer();
//		while(isr.ready()) {
//			sb.append((char) isr.read());
//		}
//		System.out.println(sb.toString());
//		isr.close();
//		fis.close();
    }

    public static void copyData(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        ReadableByteChannel rbc = fis.getChannel();
        FileOutputStream fos = new FileOutputStream(dest);
        WritableByteChannel wbc = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
        while (rbc.read(buffer) != -1) {
            // The buffer is used to drained
            buffer.flip();
            // keep sure that buffer was fully drained
            while (buffer.hasRemaining()) {
                wbc.write(buffer);
            }
            buffer.clear(); // Now the buffer is empty, ready for the filling
        }
        rbc.close();
        fis.close();
        wbc.close();
        fos.close();
        System.out.println("Copy Data finished.");
    }


}
