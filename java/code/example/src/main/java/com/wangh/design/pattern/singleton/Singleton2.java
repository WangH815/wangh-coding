package com.wangh.design.pattern.singleton;

/**
 * 饿汉式单例
 */
public class Singleton2 {
    // 私有化构造器,防止手动实例化
    private Singleton2() {
    }

    // 类加载时直接实例化
    private static final Singleton2 singleton2 = new Singleton2();

    // 获取实例的公共方法
    public static Singleton2 getInstance() {
        return singleton2;
    }
}
