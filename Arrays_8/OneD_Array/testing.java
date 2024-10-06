//package com.mj.Arrays_8;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class testing{
//    static String[] str = new String[3];
//    public static void main(String[] args) {        // take string in array and print it.
//        System.out.println("Enter 3 strings exactly");
//
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < str.length; i++) {
//           str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));
//        System.out.println("Do you want to change any entry,press y or n");
//        char input = sc.next().charAt(0);
//        if(input== 'y'){
//            changeFunction(input);
//        }
//        else{
//            return;
//        }
//
//    }
//
//    static void changeFunction(char i){
//        System.out.println(Arrays.toString(str));
//        System.out.println("0 1 2 ");
//
//        System.out.println("enter the index where you want to make a change ");
//        Scanner sc = new Scanner(System.in);
//        int index = sc.nextInt();
//        System.out.println("Enter the string with what you want to replace the index position with");
//        String value = sc.nextLine();
//        str[index] = value;
//        System.out.println(Arrays.toString(str));
//    }
//}
//



package com.mj.Arrays_8.OneD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class testing {
    static String[] str = new String[3];

    public static void main(String[] args) {
        System.out.println("Enter 3 strings");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next(); // Assuming single-word input is acceptable
        }

        System.out.println(Arrays.toString(str));
        System.out.println("Do you want to change any entry? Press y or n");
        char input = sc.next().charAt(0);

        if (input == 'y') {
            changeFunction(sc); // Pass the Scanner instance
        } else {
            sc.close(); // Close the Scanner before exiting
            return;
        }

        sc.close(); // Close the Scanner
    }

    static void changeFunction(Scanner sc) {
        System.out.println(Arrays.toString(str));
        System.out.println("0 1 2 ");

        System.out.println("Enter the index where you want to make a change: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (index >= 0 && index < str.length) { // Check index bounds
            System.out.println("Enter the string to replace the index position with: ");
            String value = sc.nextLine();
            str[index] = value; // Update the array at the specified index
            System.out.println(Arrays.toString(str)); // Print the updated array
        } else {
            System.out.println("Invalid index! Please enter a valid index between 0 and " + (str.length - 1) + ".");
        }
    }
}