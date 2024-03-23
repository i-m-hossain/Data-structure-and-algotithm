package org.example.Utility;

import java.util.Scanner;

public class UserInput {
    public Integer getIntegerValue(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Integer data = scanner.nextInt();
        return data;
    }
}
