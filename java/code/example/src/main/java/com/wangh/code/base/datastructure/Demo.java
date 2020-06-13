package com.wangh.code.base.datastructure;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        // 八大基本数据类型
        boolean bool = true; // 布尔;默认为flase,其他基本类型默认为0
        byte b = 12;         // 单字节
        short s = 12;        // 双字节
        char c = 'a';        // 双字节;单引号或数字
        int i = 10;          // 4字节
        long l = 10L;        // 8字节
        float f = 1.0f;      // 4字节
        double d = 1.0d;     // 8字节

        byte b1 = 'a';       // ascii码字符

        char c1 = 32;        // 数字转换
        char c2 = '\u0000';  // 16进制Unicode码表示;最大为 \uffff

        // 包装类
        Boolean bool1 = true;
        Byte bByte = 12;
        Short s1 = 12;
        Character character = 'a';
        Integer integer = 10;
        Long l1 = 10L;
        Float f1 = 1.0f;
        Double d1 = 1.0d;

        // 常用方法
        Integer.toBinaryString(-2);                      // 返回二进制补码字符串(实际存储方式);正数忽略前面的0
        Integer.parseUnsignedInt("7fffffff", 16);  // 指定进制补码字符串转为整数;字符串通过最高位判断是否为负数
        Integer.parseInt("-7fffffff", 16);         // 字符串表示数值部分;通过字符串前正负号表示正负数(+可省略)

    }
}
