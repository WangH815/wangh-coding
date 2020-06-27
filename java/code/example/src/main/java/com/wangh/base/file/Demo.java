package com.wangh.base.file;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建;文件和目录都是File
        File file = new File("C:\\User\\WangH\\1.txt");  // windows平台写法;其他平台使用 /home/wangh/1.txt
        File file1 = new File("/home","121.log");     // 要求上级目录必须存在
        File dir = new File("/home/wangh/test/");

        // 常用方法
        file.createNewFile();   // 创建文件;要求目录必须存在
        file.exists();
        file.getName();
        file.getParent();
        file.getParentFile();
        file.getAbsolutePath();
        file.isFile();
        file.isDirectory();
        file.delete();          // 只能删除文件或空文件夹
        file.canRead();
        file.canWrite();
        file.canExecute();
        dir.mkdir();            // 创建目录;要求上级目录必须存在
        dir.mkdirs();           // 创建目录;上级目录不存在时会逐级创建
        dir.list();             // 返回当前文件夹所有文件及目录的字符串数组;不含绝对目录及子目录
        dir.listFiles();        // 返回File数组;不含子目录

        Long lastModified = file.lastModified();  // 获取文件(或目录修改时间);可使用Date + SimpleDateFormat格式化时间

    }
}
