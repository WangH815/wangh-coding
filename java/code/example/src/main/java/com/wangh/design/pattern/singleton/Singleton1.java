package com.wangh.design.pattern.singleton;

/**
 * 单例模式
 * 分类：懒汉式(使用时加载)；饿汉式(类加载时加载)
 * 本例为懒汉式
 */
public class Singleton1 {
    // 私有化构造器,防止手动实例化
    private Singleton1() {
    }

//    private static Singleton1 singleton1;

    // 未实例化；volatile保证内存可见性,线程每次操作该变量都需要先读取该变量
    private static volatile Singleton1 singleton1;

    // 获取单例
//    public static Singleton1 getInstance(){
//        if(singleton1 == null){
//            singleton1 = new Singleton1();
//        }
//        return singleton1;
//    }

    // 获取单例(优化)
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            // 增加同步锁
            synchronized (Singleton1.class) {
                // 此条件分支只有一个线程能进入
                if(singleton1 == null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
