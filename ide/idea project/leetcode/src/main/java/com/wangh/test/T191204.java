package com.wangh.test;

public class T191204 {
    public static void main(String[] args) {
//        System.out.println("hello java!");
        FJ fj = new FJ();
        fj.size= FJ.FF.S;
        System.out.println(fj.size);

    }
}

class FJ {
    enum FF {S, M, L}

    FF size;
}

class Dog{
    public Dog(String str){

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    String str;
    int i;
    void slepping(){

    }
}