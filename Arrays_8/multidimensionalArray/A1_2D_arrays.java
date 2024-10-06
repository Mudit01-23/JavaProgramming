package com.mj.Arrays_8.multidimensionalArray;

import java.util.Arrays;

public class A1_2D_arrays {
    public static void main(String[] args) {
        int[] [] arr = new int[3][];

        arr =  new int [][]{
                {1, 2, 3},
                {4, 5, },
                {6,7, 8, 9}
        };

        System.out.println(Arrays.deepToString(arr));
    }
}
