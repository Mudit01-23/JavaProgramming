package com.mj.Arrays_8.multidimensionalArray;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//public class A4_ArrayList{
//    public static void main(String[] args) {
//        ArrayList<Integer>  list = new ArrayList<>(10);
//        list.add(4);
//        list.add(23);
//        list.add(5);
//        list.add(6);
//        System.out.println();
//        list.add(4);
//        list.add(23);
//        list.add(5);
//        list.add(6);
//        System.out.println();
//        list.add(4);
//        list.add(23);
//        list.add(5);
//        list.add(6);
//
//        System.out.println(list);
//        list.set(0,1);
//        System.out.println(list);
//        //ArrayList<String> OneMoreList = new ArrayList<>(5);
//    }
//
//}

//                          input inside arraylist

//public class A4_ArrayList{
//    public static void main(String[] args) {
//        System.out.println("Enter the numbers inside ArrayList");
//         ArrayList<Integer> list = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//       //  System.out.println(list);
//        // or
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + " ");
//        }
//    }
//}


// this is written by AI to store any no of integers inside arraylist.

public class A4_ArrayList {
    public static void main(String[] args) {
        System.out.println("Enter the numbers inside ArrayList (enter -1 to stop):");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number == -1) { // Sentinel value to stop input
                break;
            }
            list.add(number);
        }

        // Print the numbers
        System.out.println("You entered: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close(); // Close the scanner
    }
}