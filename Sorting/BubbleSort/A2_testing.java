package com.mj.Sorting.BubbleSort;

import java.util.Arrays;

public class A2_testing {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 2, 3, 4, 2};
        bubbleSort(array);
        System.out.println("Final sorted array: " + Arrays.toString(array));  // Print the sorted array
    }

    public static void bubbleSort(int[] array) {
        int pass = 1;  // To track the pass number
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;  // Reset swap flag for each pass

            System.out.println("Pass No - " + pass + ":");
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    // Swap elements
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                    // Print the array after the swap
                    System.out.println("  Swapped " + array[j] + " and " + array[j - 1] + ": " + Arrays.toString(array));
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                System.out.println("  No swaps in this pass. Array is sorted.");
                break;
            }

            pass++;  // Increment pass number for next iteration
        }
    }
}