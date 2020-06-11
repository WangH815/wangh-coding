package com.wangh.code.base.thread;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.start();
    }

    @Override
    /**
     * 自定义进程类逻辑部分
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        System.out.println("线程名：" + MyThread.currentThread().getName());
    }
}
