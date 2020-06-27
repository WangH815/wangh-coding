package com.wangh.daily.t201912;

/**
 * 死锁
 */
public class T191229 {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (obj1){
                System.out.println(Thread.currentThread()+" get resource1");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+" waiting get resource2");
                synchronized (obj2){
                    System.out.println(Thread.currentThread()+" get resource2");
                }
            }
        },"线程 1").start();

        new Thread(()->{
            synchronized (obj2){
                System.out.println(Thread.currentThread()+" get resource2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+" waiting get resource1");
                synchronized (obj1){
                    System.out.println(Thread.currentThread()+" get resource1");
                }
            }
        },"线程 2").start();
    }
}
