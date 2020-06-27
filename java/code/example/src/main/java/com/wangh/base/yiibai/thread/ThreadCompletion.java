package com.wangh.base.yiibai.thread;

public class ThreadCompletion {
    public static void main(String[] argv) throws Exception {
        MyThread thread = new MyThread();
        thread.start();

        if (thread.isAlive()) {
            System.out.println("Thread has not finished");
        } else {
            System.out.println("Finished");
        }
        long delayMillis = 5000;
        thread.join(delayMillis);
        if (thread.isAlive()) {
            System.out.println("thread has not finished");
        } else {
            System.out.println("Finished");
        }
        thread.join();
    }
}

class MyThread extends Thread {

    boolean stop = false;

    @SuppressWarnings("unused")
	public void run() {
        int i = 0;
        while (stop) {
            return ;
        }
    }
}
