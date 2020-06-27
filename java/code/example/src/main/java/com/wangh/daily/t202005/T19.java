package com.wangh.daily.t202005;

public class T19 {
    T19(){
        System.out.println("无参构造方法...");
    }

    public static void main(String[] args) {
        T19 t19 = new T19();
        myPrint("1234");

        Student s =new Student();
        System.out.println(s.getName());
    }

    // 先加载静态资源
    static {
        System.out.println("加载静态资源...");
    }

    public static void myPrint(final String context){
        System.out.println(context);
    }
}


class Student{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int id;
    private String name;
    private int age;

}
