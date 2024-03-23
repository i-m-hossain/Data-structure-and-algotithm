package org.example;

import java.util.Arrays;

public class UndirectedGraph {
    int V; // vertices
    int E; // edges
    int[][] adjacencyMatrix;

    UndirectedGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjacencyMatrix = new int[nodes][nodes];
    }

    public void addEdge(int x, int y) {
        adjacencyMatrix[x][y] = 1;
        adjacencyMatrix[y][x] = 1;
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adjacencyMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append(" \n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(3, 1);
        System.out.println(graph);
    }

}
