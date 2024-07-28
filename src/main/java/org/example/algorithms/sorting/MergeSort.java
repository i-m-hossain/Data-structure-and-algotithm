package org.example.algorithms.sorting;

import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> mergeSort(ArrayList<Integer> array){
        int length = array.size();
        if(length ==1){
            return array;
        }
        int middle = length/2;
        ArrayList<Integer> left = new ArrayList<>(array.subList(0, middle));
        ArrayList<Integer> right = new ArrayList<>(array.subList(middle, length));
        return merge(mergeSort(left), mergeSort(right));
    }
    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex=0;
        int rightIndex=0;
        while(leftIndex <left.size() && rightIndex <right.size()){
            if(left.get(leftIndex) <right.get(rightIndex)){
                result.add(left.get(leftIndex));
                leftIndex++;
            }else{
                result.add(right.get(rightIndex));
                rightIndex ++;
            }
        }
        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }
        // Add elements from right array starting from rightIndex
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> result = mergeSort.mergeSort(numbers);
        System.out.println(result);
    }


}
