package com.mj.A10_BinarySearch;

import java.util.*;


//public class A12_AccentureTest {
//    public static void main(String[] args) {
//        // Input string with alphabets separated by commas
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string of alphabets separated by commas: ");
//        String input = sc.nextLine();
//
//        // Split the input string by commas to create an array
//        String[] elements = input.split(",");
//
//        // Create a set to store unique elements
//        Set<String> uniqueElements = new HashSet<>();
//
//        // Add elements from the array to the set
//        for (String element : elements) {
//            uniqueElements.add(element.trim()); // Trim to remove any extra spaces
//        }
//
//        // Display the count of unique elements
//        System.out.println("Number of unique elements: " + uniqueElements.size());
//    }
//}




public class A12_AccentureTest {
    public static void main(String[] args) {
        // Input the full name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the full name: ");
        String name = sc.nextLine();

        // Call the method to print initials
        printInitials(name);
    }

    // Method to print the initials from the full name
    public static void printInitials(String name) {
        // Split the name into individual words
        String[] words = name.trim().split("\\s+");

        // Loop through each word and print the first letter
        for (String word : words) {
            if (!word.isEmpty()) {
                // Print the first character of the word in uppercase
                System.out.print(word.charAt(0) + " ");
            }
        }
    }
}