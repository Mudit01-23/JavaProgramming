package com.mj.Arrays_8.OneD_Array;
import java.util.Arrays;
import java.util.Scanner;
public class A4_ArrayIntergerInput {                // this is an array of primitives

    public static void main(String[] args) {
        System.out.print("Enter the numbers in array: ");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
// input using loops

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");


        // doing the same stuff using (enhanced for loop)

//        for(int i:arr){
//            System.out.print(i+ " ");
//        }

        // one more method of doing this - use Arrays.toString() method

        System.out.println(Arrays.toString(arr));



        }
    }


