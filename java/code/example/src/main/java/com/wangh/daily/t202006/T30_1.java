package com.wangh.daily.t202006;

import java.util.stream.Stream;

/**
 * 多态、方法引用、流式编程
 */
public class T30_1 {
    public static void main(String[] args) {
        // 流式编程
        Stream.of(new Circle(),
                new Square(),
                new Triangle())
                .forEach(Shape::draw); // 方法引用
    }
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");  // this表示class.toString()
    }

    @Override
    public abstract String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}
