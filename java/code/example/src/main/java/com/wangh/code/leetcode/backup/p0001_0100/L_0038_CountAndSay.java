package com.wangh.code.leetcode.backup.p0001_0100;

public class L_0038_CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay1(9));
        System.out.println(countAndSay2(9));
    }

    public static String countAndSay1(int n) {
        //第一行就直接输出
        if (n == 1) {
            return "1";
        }
        //得到上一行的字符串
        String last = countAndSay1(n - 1);
        //输出当前行的字符串
        return getNextString1(last);

    }

    private static String getNextString1(String last) {
        //长度为 0 就返回空字符串
        if (last.length() == 0) {
            return "";
        }
        //得到第 1 个字符重复的次数
        int num = getRepeatNum1(last);
        // 次数 + 当前字符 + 其余的字符串的情况
        return num + "" + last.charAt(0) + getNextString1(last.substring(num));
    }

    //得到字符 string[0] 的重复个数，例如 "111221" 返回 3
    private static int getRepeatNum1(String string) {
        int count = 1;
        char same = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (same == string.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static String countAndSay2(int n) {
        String res = "1";
        //从第一行开始，一行一行产生
        while (n > 1) {
            String temp = "";
            for (int i = 0; i < res.length(); i++) {
                int num = getRepeatNum2(res.substring(i));
                temp = temp + num + "" + res.charAt(i);
                //跳过重复的字符
                i = i + num - 1;
            }
            n--;
            //更新
            res = temp;
        }
        return res;

    }
    //得到字符 string[0] 的重复个数，例如 "111221" 返回 3
    private static int getRepeatNum2(String string) {
        int count = 1;
        char same = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (same == string.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
