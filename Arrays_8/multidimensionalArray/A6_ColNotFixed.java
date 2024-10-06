package com.mj.Arrays_8.multidimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A6_ColNotFixed {
    public static void main(String[] args) {
                                        // here the array is not fixed

        int[][] arr = {
                {3,4,55},
                {5},
                {4,66,23,2324}
        };
        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" " );
//
//
//            }
            //System.out.println();

            // or printing using arrays.toString

            System.out.println(Arrays.toString(arr[row]));


        }
    }   
}
