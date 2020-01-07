package com.wangh.t202001;

import java.io.IOException;

public class T07 {
    static int num;
    static long ans;
    static Stack thestack;

    public static void main(String[] args) throws IOException {
        num = 10;
        stackAddition();
        System.out.println(ans);
    }

    public static void stackAddition() {
        thestack = new Stack(10000);
        ans = 0;
        while (num > 0) {
            thestack.push(num--);
        }
        while(!thestack.isEmpty()){
            ans += thestack.pop();
        }
    }
}

/*
* 栈类
*/
class Stack {
    private int maxSize;
    private int[] data;
    private int top;

    Stack(int maxSize) {        //
        this.maxSize = maxSize;
        data = new int[maxSize];
        top = -1;
    }

    public void push(int p) {  //进栈
        data[++top] = p;
    }

    public int pop() {    //出栈
        return data[top--];
    }

    public int peek() {   //获取当前值
        return data[top];
    }

    public boolean isEmpty() {  //判断是否为空
        return top == -1;
    }
}