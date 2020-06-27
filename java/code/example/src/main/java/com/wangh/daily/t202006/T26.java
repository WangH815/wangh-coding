package com.wangh.daily.t202006;

public class T26 extends Foo {
    static int i;
    int j;

    static {
        System.out.println(121);
    }

    public static void main(String[] args) {
        System.out.println(i);
        T26 t26 = new T26();
        System.out.println(t26.j);
        String str = "123";
    }

}

class Foo {
    Foo() {
        System.out.println("This is Foo!");
        speak();
    }

    void speak() {
        System.out.println("Foo do");
    }
}
