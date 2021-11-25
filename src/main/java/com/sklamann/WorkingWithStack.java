package com.sklamann;

import java.util.Stack;

public class WorkingWithStack {

    public static void main(String[] args) {
        //Stack class represents a last-in-first-out stack of objects
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}
