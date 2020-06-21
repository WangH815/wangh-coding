package com.wangh.code.daily.t202006;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.ChineseDate;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.*;
import com.wangh.code.base.io.IOUtil;

import java.io.*;
import java.util.Date;

public class T19 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setAge(23);

        // 深度克隆;被克隆对象要求实现序列化接口
        A a2 = ObjectUtil.clone(a1);
        a2.setAge(24);
        System.out.println(a1.getAge());

        // Convert 类型转换
        int a = 112312;
        String str = Convert.toStr(a);

        String str1 = "我是一个可爱的字符串";
        System.out.println(Convert.toHex(str1, CharsetUtil.CHARSET_UTF_8));  // 字符串转16进制表示

        String str2 = Convert.strToUnicode(str1);                            // 字符串转unicode形式
        System.out.println(str2);

        double d = 13204123.23;
        System.out.println(Convert.digitToChinese(d));

        // 日期转换
        System.out.println(DateUtil.date());                    // 默认形式: yyyy-MM-dd
        ChineseDate chineseDate = new ChineseDate(new Date());  // 农历日期
        System.out.println(chineseDate);

//        BufferedInputStream in = FileUtil.getInputStream("d:/test.txt");
//        BufferedOutputStream out = FileUtil.getOutputStream("d:/test2.txt");
//        long copySize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);

        File[] fs = FileUtil.ls("c:");   // shell命令形式的文件目录操作
        for (File f : fs) {
            System.out.println(f.getAbsolutePath());
        }

        // 执行系统命令
        System.out.println(RuntimeUtil.execForStr("ipconfig"));

        // 随机数
        int[] ints = NumberUtil.generateRandomNumber(0, 100, 20);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        System.out.println(RandomUtil.randomString(20));
    }
}

class A implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

}
