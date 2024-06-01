package org.example.DataStructure.ll;

public class LinkedList implements LinkedListMethods {
    private Node head;

    /**
     * Adding node to the head of the linked list
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    @Override
    public void addNodeAtTheHead(Node new_node) {
        //as the new node will be updated head, the new node's next property is the current head
        if (head == null) {
            this.head = new_node;
            return;
        }
        new_node.next = this.head;
        // now the new node is our current head
        this.head = new_node;
    }

    /*
     * Insert a Node after a Given Node in Linked List
     * Time complexity: O(1)
     * space complexity: o(1)
     * */
    @Override
    public void insertAfterGivenNode(Node target_node, Node new_node) {
        if (target_node == null) {
            System.out.println("please specify a node");
            return;
        }
        new_node.next = target_node.next;
        target_node.next = new_node;
    }

    /*
     * Insert at the end of the linked list
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    @Override
    public void insertAtTheEnd(Node node) {
        Node last = this.head;
        if (last == null) {
            this.head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    /*
     * Traversing linked list elements from head to the end
     * running a loop until a node with null is reached
     * */
    @Override
    public void traverseLinkedList() {
        Node currentNode = head;
        System.out.print("Linked List: {");
        while (currentNode != null) {
            System.out.print(currentNode.value + ", ");
            currentNode = currentNode.next;
        }
        System.out.println("}");
    }

    /*
     * Searching a value in linked list with iterative approach
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    @Override
    public Boolean searchItemIterative(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /*
     * Searching a value in linked list with recursive approach
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    @Override
    public Boolean searchItemRecursive(Node head, int value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            return true;
        }
        return searchItemRecursive(head.next, value);
    }

    /*
     * finding the length of the linked list iterative approach
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    @Override
    public int findLengthOfLinkedListIterative() {
        Node currentNode = head;
        int linkedListLength = 0;
        while (currentNode != null) {
            linkedListLength++;
            currentNode = currentNode.next;
        }
        return linkedListLength;
    }

    /*
     * finding the length of the linked list recursive approach
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    @Override
    public int findLengthOfLinkedListRecursive(Node node, int count) {
        if (node == null) {
            return count;
        }
        count++;
        return findLengthOfLinkedListRecursive(node.next, count);
    }

    public static void main(String[] args) {
        /*--- creating linked list ---*/
        LinkedList ll = new LinkedList();

        /*--- creating Nodes ---*/
        Node node0 = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node node4 = new Node(50);
        Node node5 = new Node(60);
        Node node6 = new Node(70);

        /*--- Adding node ---*/
        ll.addNodeAtTheHead(node0);
        ll.addNodeAtTheHead(node1);
        ll.addNodeAtTheHead(node2);
        ll.addNodeAtTheHead(node3);
        ll.addNodeAtTheHead(node4);
        ll.addNodeAtTheHead(node5);
        ll.addNodeAtTheHead(node6);

        /*--- Traverse linked list members ---*/
        ll.traverseLinkedList();

        /*--- insert a node after a targeted node ---*/
        Node node_to_be_insert = new Node(100);
        ll.insertAfterGivenNode(node4, node_to_be_insert);

        /*--- insert a node at the end ---*/
        Node node_to_be_inserted_at_the_end = new Node(899);
        ll.insertAtTheEnd(node_to_be_inserted_at_the_end);
        ll.traverseLinkedList();

        /*--- Search item---*/
        Boolean itemFound = ll.searchItemIterative(899);
//        Boolean itemFound = ll.searchItemRecursive(ll.head, 8990);
        if (itemFound) {
            System.out.println("yes item found!");
        } else {
            System.out.println("no, item not found");
        }

//        int linkedListLength = ll.findLengthOfLinkedListIterative();
        int linkedListLength = ll.findLengthOfLinkedListRecursive(ll.head, 0);
        System.out.println("linked list length: " + linkedListLength);

    }

}
