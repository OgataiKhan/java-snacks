package org.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String userString;

        System.out.print("Enter a string: ");
        userString = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int symbolsCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (Character.isLetter(userString.charAt(i))){
                lettersCount++;
            } else if (Character.isDigit(userString.charAt(i))) {
                digitsCount++;
            } else {
                symbolsCount++;
            }
        }

        System.out.println("Letters: " + lettersCount);
        System.out.println("Digits: " + digitsCount);
        System.out.println("Symbols: " + symbolsCount);

        // Close Scanner
        scanner.close();
    }
}
