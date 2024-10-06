package com.mj.Arrays_8.OneD_Array;
import java.util.Arrays;
import java.util.Scanner;
public class A5_ArrayStringInput {
    public static void main(String[] args) {            // this word array can be replaced with str, it will be a better naming convention

        System.out.println("Enter the string: ");           // this is an array of objects
        Scanner sc = new Scanner(System.in);

        String[] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+ " ");            // but this method does not print in the form of an array
//        }

        System.out.println(Arrays.toString(array));



    }


}

