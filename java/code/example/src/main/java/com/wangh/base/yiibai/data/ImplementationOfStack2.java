package com.wangh.base.yiibai.data;

import java.util.Stack;

public class ImplementationOfStack2 {
    static void showpush(Stack<Integer> stack, int a) {
        stack.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }

    static void showpop(Stack<?> stack1) {
        Integer a = (Integer) stack1.pop();
        System.out.println(a);
        System.out.println("stack: " + stack1);
    }

    public static void main(String args[]) {
//      Stack stack1 = new Stack();
//      System.out.println("stack: " + stack1);
//      showpush(stack1, 40);
//      showpush(stack1, 50);
//      showpush(stack1, 60);
//      showpop(stack1);
//      showpop(stack1);
//      showpop(stack1);
//      try {
//         showpop(stack1);
//      } catch (EmptyStackException e) {
//         System.out.println("it Is Empty Stack");
//      } 
    }
}
