package org.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = 0;

        for (int i = 1; i < numbers.length; i = i + 2) {
            result += numbers[i];
        }

        System.out.println(result);
    }
}

