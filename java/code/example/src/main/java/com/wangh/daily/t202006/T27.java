package com.wangh.daily.t202006;


public class T27 implements ExampleInterface {
    public static void main(String[] args) {
        T27 t27 = new T27();
        t27.newMethod();


        T27_2.Inner1 inner1 = new T27_2().new Inner1();
        inner1.method();
//        System.out.println(inner1.flied);  // 无法访问内部类
    }


    @Override
    public void firstMethod() {

    }

    @Override
    public int secondMethod() {
        return 0;
    }

    @Override
    public String thirdMethod() {
        return null;
    }

}

/**
 * 同一文件允许有接口，尽管他默认也是public; 类中定义接口可以使private（用的不多）
 */
interface ExampleInterface {
    int i = 1;

    void firstMethod();

    int secondMethod();

    String thirdMethod();

    /**
     * jdk8增加的默认方法，在不破坏已有接口实现类的情况下增加新的方法
     */
    default void newMethod() {
        System.out.println("new method!");
    }

    // 可以有多个默认方法
    default void method() {
        System.out.println("method!");
    }

    /**
     * jdk8还支持接口中增加静态方法
     */
    static void staticMethod() {
        System.out.println("static method!");
    }
}

/**
 * 工厂示例
 */

// 服务接口
interface Service {
    void method1();

    void method2();
}

// 服务1
class ServiceImpl1 implements Service {

    @Override
    public void method1() {
        System.out.println("ServiceImpl1 method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImpl1 method2");

    }
}

// 服务2
class ServiceImpl2 implements Service {

    @Override
    public void method1() {
        System.out.println("ServiceImpl2 method1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImpl2 method2");

    }
}


// 服务工厂
class ServiceFactory {
    static Service getService(String service) {
        if (service.equals("ServiceImpl1"))
            return new ServiceImpl1();
        else if (service.equals("ServiceImpl2"))
            return new ServiceImpl2();
        else
            return null;
    }
}
