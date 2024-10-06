package com.mj.Arrays_8.multidimensionalArray;

import java.util.Arrays;

public class A9_testing {
    public static void main(String[] args) {
        String[][] array = {
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"},
        };

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]+ " ");
            }
            System.out.println();
        }




    }
}
