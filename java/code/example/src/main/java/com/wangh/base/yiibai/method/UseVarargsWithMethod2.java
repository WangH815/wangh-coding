package com.wangh.base.yiibai.method;

public class UseVarargsWithMethod2 {
    static void display(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        display();
        display("yiibai.com");
        display("my", "name", "is", "Sukia");
    }
}
