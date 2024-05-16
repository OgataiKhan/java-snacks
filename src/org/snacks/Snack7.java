package org.snacks;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        int totalSeconds;

        System.out.print("Enter a number of seconds: ");
        totalSeconds = Integer.parseInt(scanner.nextLine());

        int hours, minutes, seconds;

        hours = totalSeconds / 3600;
        minutes = totalSeconds % 3600 / 60;
        seconds = totalSeconds % 60;

        System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));

        // Close Scanner
        scanner.close();
    }
}
