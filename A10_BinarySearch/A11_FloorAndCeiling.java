package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class A11_FloorAndCeiling {
    public static void main(String[] args) {
       // int[] array = {10,14,19,25,28,33,38,48,100};
        int[] array ={90,80,70,60,50,40,30,20,10};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the target element:  ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int ceiling = ceiling(array, target);
        int floor = floor(array, target);

        System.out.println("The ceiling and floor of " + target + " is [" + ceiling + "," + floor + "] respectively");
    }

    public static int ceiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // If the target is greater than the largest element
        if (target > array[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return array[mid];
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return array[start]; // Start will be at the ceiling position
    }

    public static int floor(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // If the target is smaller than the smallest element
        if (target < array[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return array[mid];
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return array[end]; // End will be at the floor position
    }
}