package org.example.Graph;

import org.example.Utility.UserInput;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Integer maxValue = new UserInput().getIntegerValue("Length of the list:");
        //get arraylist
        QuickFindUF quickFindUF = new QuickFindUF(maxValue);

        for (int i = 0; i < maxValue; i++) {
            Integer first = new UserInput().getIntegerValue("First value:");
            Integer second = new UserInput().getIntegerValue("Second value");
            Boolean isConnected = quickFindUF.connected(first, second);

            if (!isConnected) {
                int[] data = quickFindUF.union(first, second);
                System.out.println(Arrays.toString(data));
            } else {
                System.out.println("the nodes are already connected");
            }
        }


    }

}