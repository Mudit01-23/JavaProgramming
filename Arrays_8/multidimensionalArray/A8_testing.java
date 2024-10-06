package com.mj.Arrays_8.multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

//public class A8_testing {
//    public static void main(String[] args) {
//        int[] array = new int[4];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 4 numbers in an array");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}


public class A8_testing {
    public static void main(String[] args) {
        int[] array = {3,4,5,67,8,245};
        int maxNo= 0;
        int minNo= 1000;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=maxNo){
                maxNo = array[i];
            }
            for (int j = 0; j < array.length; j++) {
                if(array[i]<minNo){
                    minNo = array[i];
                }
            }
        }
        System.out.println("The max no inside array is " + maxNo);
        System.out.println("The lowest no inside array is  "+ minNo);
    }
}
