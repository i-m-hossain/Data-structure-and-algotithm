package org.example.DataStructure.linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int length;
    CircularLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    public void prepend(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            this.head.setNext(head);
            this.head.setPrev(head);
        }else{
            Node currentHead = this.head;
            this.head = newNode;
            this.head.setNext(currentHead);
            currentHead.setPrev(newNode); //doubly
            this.tail.setNext(this.head); // circular
            this.head.setPrev(this.tail); //circular
        }

        this.length ++;

    }
    public void append(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            this.head.setNext(head);
            this.head.setPrev(head);
        }else{
            newNode.setPrev(this.tail); //doubly
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
            this.tail.setNext(this.head); // circular
            this.head.setPrev(this.tail); //circular
        }
        this.length ++;
    }

    public void traverse(){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = this.head;
        do {
            System.out.print(current.getValue()+ " ---> ");
            current = current.getNext();
        } while (current != head);
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
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.append("www.google.com");
        linkedList.append("www.youtube.com");
        linkedList.append("www.linkedin.com");
        linkedList.append("www.facebook.com");
        linkedList.append("www.amazon.com");
        linkedList.append("www.twitter.com");
//        linkedList.prepend("www.google.com");
//        linkedList.prepend("www.youtube.com");
//        linkedList.prepend("www.linkedin.com");
//        linkedList.prepend("www.facebook.com");
//        linkedList.prepend("www.amazon.com");
//        linkedList.prepend("www.twitter.com");
//        System.out.println(linkedList.head.getValue());
//        System.out.println(linkedList.head.getPrev());
//        System.out.println(linkedList.head.getNext());

        linkedList.traverse();
    }
}
