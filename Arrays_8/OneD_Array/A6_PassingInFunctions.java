package com.mj.Arrays_8.OneD_Array;

import java.util.Arrays;

public class A6_PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {3,4,3,4,53};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] array){
        System.out.println("Value of array after change is - ");
        array[2]= 32;
    }
}
