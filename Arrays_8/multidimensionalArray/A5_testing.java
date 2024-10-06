package com.mj.Arrays_8.multidimensionalArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//public class A5_testing {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//
//        // Add numbers from 3 to 10 to the list
//        for (int i = 3; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        // Enhanced for loop to print the numbers
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//    }
//}
//
//public class A5_testing {
//    public static void main(String[] args) {
//        System.out.println("Enter the numbers in the array");
//        String[][] array = new String[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                array[row][column] = sc.nextLine();
//
//
//            }
//        }
//
////        for (int row = 0; row <array.length ; row++) {
////            System.out.println(Arrays.toString(array[row]));
//
//
//
//    }
//
//}






public class A5_testing {
    public static void main(String[] args) {
        System.out.println("Enter the numbers in the array");
        String[][] array = new String[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = sc.nextLine();


            }
        }

        // printing using enhanced for loop
        for(String[] arr : array){
            System.out.println(Arrays.toString(arr));
        }


        }



    }




