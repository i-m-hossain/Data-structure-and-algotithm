package org.example.SortingAlgorithms;

public class SelectionSort implements Sort{
    private int[] numbers;
    SelectionSort(int[] numbers){
        this.numbers=numbers;
    }
    @Override
    public int[] sort() {
        for(int i=0; i<numbers.length; i++){
            int minIndex = i;
            // Find the index of the minimum element in the unsorted part
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[j]<numbers[minIndex])
                    minIndex = j;

            }
            // Swap only if the minimum element is not already at its correct position
            if(minIndex !=i ){
                int temp= numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i]=temp;
            }
        }
        return numbers;
    }
}
