package org.example.sort;

public class Demo {
    public static void main(String[] args) {
//        int[] numbers = new int[]{12, 32, 11, 23, 7, 89, 36, 21, 44, 75, 39};
        int[] numbers = new int[]{6, 9, 12, 2, 5, 78, 3, 56, 7, 90, 54, 76, 89, 87, 90, 865, 43, 21};
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
//
//        int[] result = bubbleSort.sort(numbers);
        int[] result = insertionSort.sort(numbers);
        for (int number : result) {
            System.out.println(number);
        }
    }
}
