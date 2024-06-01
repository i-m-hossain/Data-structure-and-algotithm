package org.example.DataStructure.ll;

public interface LinkedListMethods {
    public void addNodeAtTheHead(Node node);

    public void insertAfterGivenNode(Node target_node, Node new_node);

    public void insertAtTheEnd(Node node);

    public void traverseLinkedList();

    public Boolean searchItemRecursive(Node head, int value);

    public Boolean searchItemIterative(int value);

    public int findLengthOfLinkedListIterative();

    public int findLengthOfLinkedListRecursive(Node node, int length);

}
