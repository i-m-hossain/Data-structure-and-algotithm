package org.example.sort;

public class BubbleSort implements Sort {
    public int[] sort(int[] numbers) {
        int count1 = 0;
        int count2 = 0;
        for (int j = 0; j < numbers.length; j++) {
            count1++;
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                count2++;
                if (numbers[i] > numbers[i + 1]) {
//                    swap
                    numbers[i + 1] = numbers[i + 1] + numbers[i];
                    numbers[i] = numbers[i + 1] - numbers[i];
                    numbers[i + 1] = numbers[i + 1] - numbers[i];
                }
            }
            System.out.println("after each loop:  " + count2);
        }
        System.out.println(count1 + "---" + count2);
        return numbers;
    }
}
