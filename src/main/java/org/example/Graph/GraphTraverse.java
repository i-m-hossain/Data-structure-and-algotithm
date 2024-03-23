package org.example.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraverse {
    boolean[] visited;
    Queue<Integer> q = new LinkedList<>();
    UndirectedGraphWithLinkedList graph;

    public GraphTraverse(int nodes, int start) {
        UndirectedGraphWithLinkedList graph = new UndirectedGraphWithLinkedList(nodes);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2, 4);
        //getting the graph
        this.graph = graph;
        //initializing all nodes with visited false
        visited = new boolean[nodes];
        //only start will be true
        visited[start] = true;
        //putting the start element to the queue
        q.offer(start);
    }

    public void bfs() {
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int w : graph.arrayOfLists[u]) {
                if (!visited[w]) {
                    visited[w] = true;
                    q.offer(w);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphTraverse gt = new GraphTraverse(5, 0);
        gt.bfs();
    }
}
