package org.example.SortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 32, 11, 23, 7, 89, 36, 21, 44, 75, 20};
        numbers = new int[]{6, 9, 12, 2, 5, 78, 3, 56, 7, 90, 54, 76, 89, 87, 90, 865, 43, 21};
//        BubbleSort bubble = new BubbleSort(numbers);
//        InsertionSort insertion = new InsertionSort(numbers);
//        SelectionSort selection = new SelectionSort(numbers);
        QuickSort quick = new QuickSort(numbers);
//
//        int[] result = bubble.sort();
//        int[] result = insertion.sort();
//        int[] result = selection.sort();
        int[] result = quick.sort();
        for (int number : result) {
            System.out.println(number);
        }
    }
}
