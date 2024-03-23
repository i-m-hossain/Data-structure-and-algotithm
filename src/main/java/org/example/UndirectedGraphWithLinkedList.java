package org.example;

import java.util.LinkedList;

public class UndirectedGraphWithLinkedList {
    LinkedList<Integer>[] arrayOfLists;
    private int V;

    public LinkedList<Integer>[] getArrayOfLists() {
        return arrayOfLists;
    }

    private int E;

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }

    public UndirectedGraphWithLinkedList(int nodes) {
        // Creating an array of LinkedLists that store integers
        arrayOfLists = new LinkedList[nodes];
        V = nodes;
        // Initializing each element in the array with a new linked list
        for (int v = 0; v < V; v++) {
            arrayOfLists[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        arrayOfLists[u].add(v);
        arrayOfLists[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges" + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : arrayOfLists[v]) {
                sb.append(w + " ");

            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UndirectedGraphWithLinkedList graph = new UndirectedGraphWithLinkedList(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        System.out.println(graph);
    }
}
