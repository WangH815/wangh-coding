package com.wangh.base.yiibai.thread;

public class GettingThreadName extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        GettingThreadName tt = new GettingThreadName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}