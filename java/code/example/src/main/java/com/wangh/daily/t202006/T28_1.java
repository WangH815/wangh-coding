package com.wangh.daily.t202006;

public class T28_1 {
    public static void main(String[] args) {
        // 匿名内部类创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        // Lambda形式;new Thread(new Runnable())中Runnable为单方法接口
        new Thread(() -> System.out.println("Lambda")).start();

        // 方法引用;Go1::go相当于用Go1.go()绑定了Runnable().run()
        new Thread(Go1::go).start();
    }
}

class Go1 {
    static void go() {
        System.out.println("Go:go()");
    }
}

class Go2 {
    void go() {
        System.out.println("Go:go()");
    }
}
