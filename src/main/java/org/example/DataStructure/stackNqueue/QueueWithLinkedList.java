package org.example.DataStructure.stackNqueue;
public class QueueWithLinkedList {
    static final int capacity = 20;

    private Node first;
    private Node last;
    private int length;

    QueueWithLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public Node peek() {
        return this.first;
    }

    public QueueWithLinkedList enqueue(String value) {
        if (this.isFull()) {
            System.out.println("The queue is already full.");
            return this;
        }
        Node newNode = new Node(value);
        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        } else {
            // adding a new node to the queue i.e. adding a new node to the last node
            this.last.setNext(newNode); ;
            this.last= newNode;
        }
        this.length++;
        return this;

    }

    public Node dequeue() {
        if(this.isEmpty()){
            System.out.println("the queue is empty");
            return  null;
        }
        if(this.first == this.last){
            this.last = null;
        }
        Node dequeued = this.first;
        this.first = this.first.getNext();
        this.length --;
        return dequeued;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return capacity == length;
    }

    @Override
    public String toString() {
        return "QueueWithLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }


    public static void main(String[] args) {
        QueueWithLinkedList q = new QueueWithLinkedList();
        q.enqueue("Md");
        q.enqueue("Imran");
        q.enqueue("Hossain");
        q.enqueue("Quazi");
        q.enqueue("Sadia");
        q.enqueue("Haque");
        q.enqueue("Usha");
//        System.out.println(q);

        System.out.println(q.dequeue().getValue());
//        System.out.println(q);
    }
}
