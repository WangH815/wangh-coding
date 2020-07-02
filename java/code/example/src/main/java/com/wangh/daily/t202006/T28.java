package com.wangh.daily.t202006;

/**
 * Lambda表达式
 */
public class T28 {
    public static void main(String[] args) {
        System.out.println(description.brief());
        System.out.println(body.detailed("Hi"));
        System.out.println(multi.twoArg("wefa", 1.23));

        // 递归示例
        intCall = n -> n == 0 ? 1 : n * intCall.call(n - 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(intCall.call(i));
        }

        // 方法引用;接口类指向实现类的方法,保证执行方法的方法签名(参数类型及返回类型)一致即可
        Callable c = new Describe()::show;
        c.call("call()");

    }

    // Lambda表达式;需提供接口，可简化代码;括号中为参数列表
    static Description description = () -> "Short Info"; // 要求接口只存在一个非实现方法
    static Body body = (h) -> h + "Short Info";
    static Multi multi = (a, b) -> a + b;

    // 递归必须提供静态或实例变量
    static IntCall intCall;
}

// 以下是三个接口
interface Description {
    String brief();

    default int my(int i) {
        return 0;
    }
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

/**
 * 递归接口
 */
interface IntCall {
    int call(int arg);
}

/**
 * 方法引用
 */

interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println("Hello," + msg);
    }
}
