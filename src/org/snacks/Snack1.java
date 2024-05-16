package org.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        int userInteger;

        System.out.print("Enter an integer: ");
        userInteger = Integer.parseInt(scanner.nextLine());

       if (userInteger % 2 == 0){
           System.out.println(userInteger);
       } else {
           System.out.println(userInteger + 1);
       }

        // Close Scanner
        scanner.close();
    }
}
