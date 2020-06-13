package com.wangh.code.base.string;

/**
 * String/StringBuffer/StringBuilder示例
 */
public class Demo {
    public static void main(String[] args) {
        // 创建
        String str1 = "";
        String str2 = new String();
        String str3 = new String("");
        String str4 = "davas";
        String str5 = "a" + "b";     // 字符串拼接

        String str = "asdgadfbbvrrtghaag";
        str.indexOf("aa");        // 返回子串(也可以是基本类型)第一次出现的索引;不存在返回 -1
        str.lastIndexOf("a"); // 返回子串最后一次出现的索引
        str.intern();             // 返回字符串str(常量池中)的引用;常量池存在则返回引用否则加入常量池再返回引用
        str.toCharArray();        // 字符串转为char型数组
        str.split("a");     // 分隔指定字符串,返回字符串数组;分割字符串还有一个 StringTokenizer 类,但不常用
        str.toUpperCase();        // 转大写
        str.toLowerCase();        // 转小写
        str.substring(1, 2);      // 返回字符串子串;也可只指定开始位置
        str.contains("asdf");     // 判断是是否包括子串(可是任意随机序列)
        str.matches("a");   // 判断是否正则匹配
        str.charAt(1);            // 返回指定位置的字符
        str.isEmpty();            // 判断字符串是否为空
        str.startsWith("aasd");   // 判断以某字符串开始
        str.endsWith("aasd");     // 判断以某字符串结尾
        str.replace('a','A');       // 字符替换;全部替换
        str.replace("a","A");      // 字符串(随机序列)替换;全部替换
        str.replaceFirst("a","A");  // 正则替换
        str.replaceAll("a","A");    // 正则替换
        str.regionMatches(1, str1, 1, 9);                   // 从指定位置和长度比较字符串是否相同
        str.regionMatches(true, 1, str1, 1, 9);  // 同上,但忽略大小写
        String.valueOf(123);                          // 返回基本数据类型的字符串形式
        new StringBuffer(str).reverse().toString();   // 利用StringBuffer反转字符串


        // StringBuffer为线程安全可扩展字符串;StringBuilder为线程不安全，但效率较高
        StringBuffer sb = new StringBuffer();
        sb.append("a");     // 可无限追加

    }
}
