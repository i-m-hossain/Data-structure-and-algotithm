package org.example.algorithms.sorting;

public class InsertionSort implements Sort {
    private int[] numbers;
    InsertionSort(int[] numbers){
        this.numbers = numbers;
    }

    public int[] sort() {
        for (int i = 1; i < numbers.length; i++) {
            // checking current element is greater than the previous element
            if (numbers[i] < numbers[i - 1]) {
                // iterating over the previous subclass
                for (int j = 0; j < i + 1; j++) {
                    if (numbers[i] < numbers[j]) {
                        // swap
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        return numbers;
    }
}
