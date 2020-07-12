package com.wangh.base.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * reflect(反射)
 * 包: java.lang.reflect
 * <p>
 * 类或接口
 * Class        // 核心类
 * Field        // 变量相关
 * Method       // 方法相关
 * Constructor  // 构造器相关
 */
public class Demo {
    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException,
            NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        // 获取Class方式
        Class class1 = Foo.class;             // 通过类名直接获取;基本数据类型也可以,int.class
//        Class class2 = new Foo().getClass();  // 通过示例类获取
        Class class3 = Class.forName("com.wangh.base.reflect.Foo");  // 通过类路径

        // 常用方法
        Foo foo = (Foo) class1.newInstance(); // 通过Class实例化;若Class<Foo> class1 = Foo.class;则不需要类型转换
        class1.getName();                     // 返回类路径;包含类名
        class1.getSimpleName();               // 只返回类名

        class1.getField("i");           // 返回指定域(成员变量)
        class1.getFields();                   // 返回public域数组
        class1.getDeclaredFields();           // 返回所有域;带有Declared表示已声明的所有(包括私有),下同

        class1.getMethod("myPrint");    // 返回指定成员方法
        class1.getMethods();                  // 返回Public成员方法数组
        class1.getDeclaredMethods();

        class1.getConstructors();
        class1.getDeclaredConstructors();     // 自定义构造器

        // 反射调用
        Method method = class1.getMethod("add", int.class, int.class);  // 无参方法则只需要方法名
        method.invoke(class1.newInstance(), 1, 2);

    }
}

class Foo {
    Foo() {

    }

    private Foo(String str, int i) {

    }

    public int i;

    public void myPrint() {
        System.out.println("This is Foo!");
    }

    public int add(int i, int j) {
        return i + j;
    }
}
