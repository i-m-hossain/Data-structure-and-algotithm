package org.example.DataStructure.stackNqueue;

import java.util.Arrays;

public class StackWithArray {
    private final int capacity;
    private final String [] stack;
    private int top;
    StackWithArray(int capacity){
        this.top =-1;
        this.capacity=capacity;
        this.stack = new String[capacity];
    }
    public void push(String name){
        //check if stack is full
        System.out.println("pushing num to stack:"+name);
        if(this.isFull()){
            System.out.println("The Stack is full, i.e. Stack Overflow, can't add");
            return;
        }
        this.top += 1;
        stack[this.top] = name;
    }
    public String pop(){
        if(this.isEmpty()){
            System.out.println("The stack is empty, i.e. Stack Underflow, can't pop");
        }
        return stack[top--]; //post decrement
    }
    public String top(){
        if(this.isEmpty()){
            System.out.println("The stack is empty");
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public boolean isFull(){
        return this.capacity-1 == this.top;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "capacity=" + capacity +
                ", stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(5);
        stack.push("www.google.com");
        stack.push("www.youtube.com");
        stack.push("www.twitter.com");
        stack.push("www.facebook.com");
        stack.push("www.amazon.com");
        System.out.println("popped element:" + stack.pop());
        System.out.println("is stack empty:" + stack.isEmpty());
        System.out.println("popped element:" + stack.pop());
        System.out.println("popped element:" + stack.pop());
        System.out.println("popped element:" + stack.pop());

        System.out.println("is stack empty:" + stack.isEmpty());
        System.out.println(stack);
    }
}
