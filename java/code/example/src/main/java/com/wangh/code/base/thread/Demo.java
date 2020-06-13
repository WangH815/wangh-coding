package com.wangh.code.base.thread;

/**
 * 实现多线程方式
 */
public class Demo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();

    }


}


/**
 * 方式一：继承Thread类，重写run方法
 */
class Thread1 extends Thread{
    @Override
    /**
     * 自定义进程类逻辑部分
     */
    public void run() {
        System.out.println("run...");
    }
}


/**
 * 继承Runnable接口，实现run方法
 */
class Thread2 implements Runnable{
    @Override
    /**
     * 自定义进程类逻辑部分
     */
    public void run() {
        System.out.println("run...");
    }
}
