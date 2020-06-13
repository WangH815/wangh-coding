package com.wangh.code.base.yiibai.exception;

class Animal extends Exception {
}

class Mammel extends Animal {
}

public class ExceptionHierarchies {
    public static void main(String[] args) {
        try {
            throw new Mammel();
        } catch (Mammel m) {
            System.err.println("It is mammel");
        }
    }
}
