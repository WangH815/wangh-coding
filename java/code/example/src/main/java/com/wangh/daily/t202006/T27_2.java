package com.wangh.daily.t202006;

public class T27_2 {
    public static void main(String[] args) {

        // 成员内部类依存于外部类存在,先创建外部类
        Inner1 inner1 = new T27_2().new Inner1();
        inner1.method();
        System.out.println(inner1.flied);

        // 静态内部类不依赖于外部类，可直接创建
        StaticInner staticInner = new StaticInner();
        staticInner.method();
    }

    private int i = 2;
    static int j = 1;

    // 外部类使用时需创建内部类对象;内部类可以理解为一个Field
    Inner1 inner2 = new Inner1();

    // 成员内部类
    class Inner1 {
        private int flied = 3;

        public void method() {
            System.out.println(i);  // 访问外部类的成员变量
            System.out.println(j);  // 访问外部类静态变量
        }

    }

    void method() {
        // 局部内部类
        class Inner2 {
            private int flied = 3;

            public void method2() {
                System.out.println(i);
                System.out.println(j);
            }

        }
    }

    // 静态内部类
    static class StaticInner {
        void method() {
//            System.out.println(i);  // 不能使用外部类的非静态域和方法
            System.out.println(j);
        }
    }
}
