package com.wangh.daily.t201912;

public class T191226_1 {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();

        System.out.println("================================");
        ThreadDemo t1 = new ThreadDemo("Thread-3");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread-4");
        t2.start();
    }
}

class RunnableDemo implements Runnable {
    private Thread t;
    private String thraedName;

    RunnableDemo(String thraedName) {
        this.thraedName = thraedName;
        System.out.println("Creating " + thraedName);
    }

    public void run() {
        System.out.println("Thread " + thraedName + " Running...");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread " + thraedName + " " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + thraedName + " Interrupted...");
        }
        System.out.println("Thread " + thraedName + " Exiting...");
    }

    public void start() {
        System.out.println("Thread " + thraedName + " Starting...");
        if (t == null) {
            t = new Thread(this, thraedName);
            t.start();
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String thraedName;

    ThreadDemo(String thraedName) {
        this.thraedName = thraedName;
        System.out.println("Creating " + thraedName);
    }

    public void run() {
        System.out.println("Thread " + thraedName + " Running...");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread " + thraedName + " " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + thraedName + " Interrupted...");
        }
        System.out.println("Thread " + thraedName + " Exiting...");
    }

    public void start() {
        System.out.println("Thread " + thraedName + " Starting...");
        if (t == null) {
            t = new Thread(this, thraedName);
            t.start();
        }
    }
}