package org.example.DataStructure.StackQueue;
public class Node{
    String value;
    Node next;
    Node(String value){
        this.value = value;
        this.next =null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
