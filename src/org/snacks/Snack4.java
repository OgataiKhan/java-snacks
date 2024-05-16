package org.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String userString;

        do {
            System.out.print("Enter a string: ");
            userString = scanner.nextLine();
        } while (userString.isEmpty());

        int left = 0;
        int right = userString.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {

            if (userString.charAt(left) != userString.charAt(right)){
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome){
            System.out.println("The string '" + userString + "' is a palindrome.");
        } else {
            System.out.println("The string '" + userString + "' is not a palindrome.");
        }

        // Close Scanner
        scanner.close();
    }
}
