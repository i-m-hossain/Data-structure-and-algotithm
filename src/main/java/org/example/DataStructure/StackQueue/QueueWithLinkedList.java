package org.example.DataStructure.StackQueue;
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
            // below two lines are very important
            // which adding a new node to the queue
            // using call by reference
            this.last.next = newNode;
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
        this.first = this.first.next;
        this.length --;
        return this.first;
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
        System.out.println(q);

        System.out.println(q.dequeue().value);
        System.out.println(q);
    }
}
