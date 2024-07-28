package org.example.DataStructure.linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    DoublyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    public void prepend(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
        }else{
            Node currentHead = this.head;
            this.head = newNode;
            this.head.setNext(currentHead);
            currentHead.setPrev(newNode);
        }

        this.length ++;

    }
    public void append(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;

        }
        this.length ++;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
//        linkedList.append("www.google.com");
//        linkedList.append("www.youtube.com");
//        linkedList.append("www.linkedin.com");
//        linkedList.append("www.facebook.com");
//        linkedList.append("www.amazon.com");
//        linkedList.append("www.twitter.com");
        linkedList.prepend("www.google.com");
        linkedList.prepend("www.youtube.com");
        linkedList.prepend("www.linkedin.com");
        linkedList.prepend("www.facebook.com");
        linkedList.prepend("www.amazon.com");
        linkedList.prepend("www.twitter.com");
        System.out.println(linkedList);
    }
}
