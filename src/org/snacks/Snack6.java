package org.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String userStringInteger;

        System.out.print("Enter an integer: ");
        userStringInteger = scanner.nextLine();

        int result = 0, position = 1;
        for (int i = userStringInteger.length()-1; i >= 0; i--) {
            result += (userStringInteger.charAt(i) - '0') * position;
            position *= 10;
        }

        System.out.println(result);

        // Close Scanner
        scanner.close();
    }
}
