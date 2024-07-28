package org.example.algorithms.sorting;

public class QuickSort implements Sort {
    private int[] numbers;

    QuickSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void partition(int start, int end) {
        int pivot = numbers[end];
        int current = 0;
        for (int i = 0; i < end; i++) {
            if (numbers[i] <= pivot) {
                swap(current, i);
                current++;
            }
        }
        swap(current, end);
        if (start < current - 1) {
            partition(start, current - 1);
        }
        if (current + 1 < end) {
            partition(current + 1, end);
        }
    }

    public void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    //{12, 32, 11, 23, 7, 89, 36, 21, 44, 75, 20}
    @Override
    public int[] sort() {
        int end = numbers.length - 1;
        partition(0, end);
        return numbers;
    }
}
