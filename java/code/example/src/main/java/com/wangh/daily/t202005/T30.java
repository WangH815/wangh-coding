package com.wangh.daily.t202005;

public class T30 {
    public static void main(String[] args) {
        // Lambda表达式创建线程
        new Thread(() -> {
            System.out.println("new Thread!");
        }).start();
    }
}
