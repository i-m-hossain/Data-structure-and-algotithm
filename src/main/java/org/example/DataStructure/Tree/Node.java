package org.example.DataStructure.Tree;

public class Node {
    int value;
    Node right;
    Node left;
    Node(int value){
        this.left =null;
        this.right = null;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
