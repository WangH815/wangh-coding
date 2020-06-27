package com.wangh.base.yiibai.data;

import java.util.Scanner;

class Stack3 {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack3(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class StringReversalUsingStack2 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int stackSize = input.length();
        Stack3 theStack = new Stack3(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            System.out.print(ch);
        }
        scan.close();
    }
}
