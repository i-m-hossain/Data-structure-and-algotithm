package org.example.DataStructure.stack;

import java.util.Arrays;

public class Stack {
    private final int capacity;
    private final int[] stack;
    private int top;
    Stack(int capacity){
        this.top =-1;
        this.capacity=capacity;
        this.stack = new int[capacity];
    }
    public void push(int num){
        //check if stack is full
        System.out.println("pushing num to stack:"+num);
        if(this.isFull()){
            System.out.println("The Stack is full, i.e. Stack Overflow, can't add");
            return;
        }
        this.top += 1;
        stack[this.top] = num;
    }
    public int pop(){
        if(this.isEmpty()){
            System.out.println("The stack is empty, i.e. Stack Underflow, can't pop");
        }
        return stack[top--]; //post decrement
    }
    public int top(){
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
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("popped element:" + stack.pop());
        System.out.println("is stack empty:" + stack.isEmpty());
        System.out.println("popped element:" + stack.pop());
        System.out.println("popped element:" + stack.pop());
        System.out.println("popped element:" + stack.pop());
        stack.push(60);
        System.out.println("current top element:"+ stack.top());
        System.out.println("popped element:" + stack.pop());

        System.out.println("is stack full:"  + stack.isFull());
        stack.push(200);
        System.out.println(stack);
    }
}
