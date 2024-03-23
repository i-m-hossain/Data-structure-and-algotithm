package org.example.sort;

public class InsertionSort implements Sort {

    public int[] sort(int[] numbers) {
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
