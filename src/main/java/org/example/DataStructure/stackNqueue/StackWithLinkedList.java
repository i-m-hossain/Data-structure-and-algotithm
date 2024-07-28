package org.example.DataStructure.stackNqueue;

public class StackWithLinkedList {
    Node top;
    Node bottom;
    int length;
    static final  int capacity = 20;
    StackWithLinkedList(){
        this.length =0;
        this.top = null;
        this.bottom= null;
    }

    public Node peek(){
        return this.top;
    }
    public StackWithLinkedList push(String value){

        if(this.isFull()){
            System.out.println("Stack Overflow");
            return this;
        }
        Node newNode  = new Node(value);
        if(this.isEmpty()){
            this.top = newNode;
            this.bottom = newNode;
        }else{
            Node pointer = this.top;
            this.top = newNode;
            this.top.setNext(pointer) ;
        }
        this.length ++;
        return this;
    }
    public Node pop(){
        if(this.isEmpty()){
            return  null;
        }
        //for the last element to be popped the bottom should be null too
        if(this.top == this.bottom){
            this.bottom = null;
        }
        Node target = this.top;
        this.top = this.top.getNext();
        this.length --;
        return target;
    }
    public boolean isEmpty(){
        return this.length == 0;
    }
    public boolean isFull(){
        return capacity == length;
    }

    @Override
    public String toString() {
        return "StackWithLinkedList{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push("Google");
        stack.push("Facebook");
        stack.push("Youtube");
        stack.push("Twitter");
        stack.push("Discord");
        stack.push("Discord2");
        stack.push("Discord3");
        stack.push("Discord4");
        stack.push("Discord5");
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
        System.out.println(stack.pop().getValue());
        System.out.println( stack.peek().getValue());

        System.out.println(stack);
    }
}
