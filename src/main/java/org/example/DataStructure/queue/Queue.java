package org.example.DataStructure.queue;

import java.util.Arrays;

public class Queue {
    private final int capacity;
    private final int[] queue;
    private int tail;
    private int head;
    Queue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.head =-1;
        this.tail=-1;
    }
    public void enqueue(int num){
        if(this.isFull()){
            System.out.println("The queue is already full");
            return;
        }
        if(this.isEmpty()){
            head +=1;
        }
        tail +=1;
        queue[tail] = num;
    }
    public void dequeue(int num){

    }
    public boolean isEmpty(){
        return  head == -1;
    }
    public boolean isFull(){
        return head == 0 & capacity -1 == tail;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "capacity=" + capacity +
                ", queue=" + Arrays.toString(queue) +
                ", tail=" + tail +
                ", head=" + head +
                '}';
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        System.out.println(q.toString());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.toString());
    }
}
