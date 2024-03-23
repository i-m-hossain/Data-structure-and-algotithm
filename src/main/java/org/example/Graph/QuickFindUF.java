package org.example.Graph;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int[] union(int p, int q) {
        int value = id[p];
        for (int i = 0; i < id.length; i++) {
            if (id[i] != value) {
                continue;
            }
            id[i] = id[q];
        }
        return id;
    }
}
