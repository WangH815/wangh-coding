package com.wangh.daily.t202005;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T16 {
    public static void main(String[] args) throws IOException {
        // 读取文件
        File read = new File("1.txt");
        InputStreamReader os = new InputStreamReader(new FileInputStream(read), "utf-8");
        StringBuffer sb = new StringBuffer();
        while (os.ready()) {
            sb.append((char) os.read());
        }
        System.out.print(sb);
        os.close();

        // 写入文件
        File dir = new File("dir");
        dir.mkdir();
        File write = new File("dir", "2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(write), "utf-8");
        osw.append("asdqw是梵蒂冈\n");
        osw.append("adqdsgad\n");
        osw.close();

        File fs = new File("F:\\git\\wangh-coding\\ide\\idea project\\" +
                "leetcode\\src\\main");
        T16.myListFiles(fs);

        System.out.println(Calendar.getInstance().getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));

        for (long x : fb(100)) {
            System.out.println(x);
        }

        System.out.println("\n" + Long.MAX_VALUE);
    }

    public static void myListFiles(File checkFile) {
        if (checkFile.isFile()) {
            System.out.println(checkFile.getAbsolutePath());
            return;
        } else {
            if (!checkFile.exists()) {
                System.out.println("文件或文件夹不存在...");
                return;
            }
            File[] fs = checkFile.listFiles();
            StringBuffer sb = new StringBuffer();
            if (fs != null) {
                for (File tmpFile : fs) {
                    if (tmpFile.isFile()) {
                        sb.append(tmpFile.getAbsolutePath() + "\n");
                    } else {
                        myListFiles(tmpFile);
                    }
                }
            }
            System.out.print(sb);
        }
    }

    public static long[] fb(int n) {
        long[] arrayFb = new long[n];
        arrayFb[0] = 1;
        arrayFb[1] = 1;
        long t1;
        long t2;

        if (n < 3) {
            return null;
        }
        for (int i = n; i > 2; i--) {
            arrayFb[n - i + 2] = arrayFb[n - i + 1] + arrayFb[n - i];
            if (arrayFb[n - i + 2] < 0) {
                System.out.println("最大可计算长度为: " + (n - i + 2));
                arrayFb[n - i + 2] = 0;
                break;
            }
        }
        return arrayFb;
    }

}
