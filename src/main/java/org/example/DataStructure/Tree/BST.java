package org.example.DataStructure.Tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class BST {
    private Node root;
    BST(){
        this.root = null;
    }
    /*
     * time complexity - O(logn)
     * */
    private BST insert(int value)
    {

        if(this.root == null){
            Node newNode = new Node(value);
            this.root = newNode;
            return this;
        }else{
            return this.recursiveInsert(value, this.root);

//            Node currentNode = this.root;
//            while(true){
//                if(value< currentNode.value){
//                    if(currentNode.left == null){
//                        currentNode.left = newNode;
//                        return this;
//                    }
//                    //updating the current root to new root
//                    currentNode = currentNode.left;
//                }else{
//                    if(currentNode.right == null){
//                        currentNode.right = newNode;
//                        return this;
//                    }
//                    //updating the current root to new root
//                    currentNode = currentNode.right;
//                }
//            }
        }

    }

    private BST recursiveInsert(int value, Node currentNode){
        Node newNode = new Node(value);
        if(value< currentNode.value){
            if(currentNode.left == null){
                currentNode.left = newNode;
                return this;
            }
            //updating the current root to new root
            return recursiveInsert(value, currentNode.left);
        }else{
            if(currentNode.right == null){
                currentNode.right = newNode;
                return this;
            }
            //updating the current root to new root
            return recursiveInsert(value, currentNode.right);
        }
    }
    /*
     * time complexity - O(logn)
     * */
    private Node lookup(int value)
    {
        if(this.root == null){
            System.out.println("There is no node in the treeS");
            return null;
        }

        Node result = this.lookupRecursive(value, this.root);
        if(result == null){
            System.out.println("No node matches with the search result");
            return null;
        }
        System.out.println("Result Found");
        return result;
    }

    private Node lookupRecursive(int value, Node currentNode){
        if(value == currentNode.value){
            return currentNode;
        } else if( value < currentNode.value && currentNode.left != null) {
            currentNode = currentNode.left;
            return this.lookupRecursive(value, currentNode);
        } else if(value >= currentNode.value && currentNode.right !=null){
            currentNode = currentNode.right;
            return this.lookupRecursive(value, currentNode);
        }
        return null;
    }
    /*
     * time complexity - O(logn)
     * */
    private boolean remove(int value)
    {
        if(this.root == null){
            System.out.println("No node is present");
            return false;
        }
        boolean result = this.removeRecursive(value, this.root);
        return result;
    }
    private boolean removeRecursive(int value, Node currentNode)
    {
        Node parentNode = null;
        if(value < currentNode.value && currentNode.left != null)
        {
            parentNode = currentNode;
            currentNode = currentNode.left;
            return removeRecursive(value, currentNode);
        }
        else if(value > currentNode.value && currentNode.right != null)
        {
            parentNode = currentNode;
            currentNode = currentNode.right;
            return removeRecursive(value, currentNode);
        }
        else if(value == currentNode.value)
        {
            //we have a match get to work

            //option 1: No right child
            if(currentNode.right == null){
                //Todo: complete the code later
            }
            // option 2: Right child doesn't have a left child
            else if(currentNode.right.left == null){
                //TODO: complete the code later
            }
            //options 3: Right child has a left child
            else{
                // TODO: complete the code later
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        System.out.println(bst);
//        System.out.println(bst.lookup(20));
        System.out.println(bst.lookup(15));
        System.out.println(bst.lookup(9));
    }
    //            9
    //     4          20
    //  1     6   15      170
}
