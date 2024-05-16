package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] firstNames = {
                "James",
                "Emily",
                "Michael",
                "Sarah",
                "David",
                "Ashley",
                "John",
                "Jessica",
                "Matthew",
                "Amanda"
        };

        String[] lastNames = {
                "Smith",
                "Johnson",
                "Williams",
                "Brown",
                "Jones",
                "Miller",
                "Davis",
                "Garcia",
                "Wilson",
                "Martinez"
        };

        // Create instance of Random class
        Random rand = new Random();

        int firstNameIndex, lastNameIndex;
        String[] fullNames = new String[firstNames.length];

        for (int i = 0; i < fullNames.length; i++) {
            firstNameIndex = rand.nextInt(fullNames.length);
            lastNameIndex = rand.nextInt(fullNames.length);
            fullNames[i] = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
        }

        System.out.println(Arrays.toString(fullNames));
    }
}
