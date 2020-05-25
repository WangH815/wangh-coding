package com.wangh.code.daily.t201912;

public class T191217 {
    private String name;
    private int age;
    private String designation;
    private double salary;
    final int aa = 90;

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printTest191217() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }


    public static void main(String[] args) {
        T191217 ts = new T191217();
        ts.setName("wh");
        ts.setAge(25);
        ts.setDesignation("worker");
        ts.setSalary(10000);
        ts.printTest191217();
        System.out.println(Byte.MIN_VALUE + ":" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + ":" + Short.MAX_VALUE);
        System.out.println((int) 'a');
        System.out.println(ts.aa);
    }
}
