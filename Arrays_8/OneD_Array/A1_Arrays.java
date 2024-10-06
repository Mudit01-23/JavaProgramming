package com.mj.Arrays_8.OneD_Array;

import java.util.Arrays;

public class A1_Arrays {
    public static void main(String[] args) {
        // Syntax of array -
        // datatype[] variable_name = new datatype[size];

        int[] array= {2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        String[] nameArray = {"Mudit","Kshitij","Raunaq"};
        System.out.println(" ");

        for(String i : nameArray){
            System.out.println(i);
        }
        // Important stuff to know -

        //          object   reference variable
            int[]  rollNo = new int[4];
        //  this (int[])datatype represents what is the type of data that is stored inside the array.
        // all the type of the data inside an array should be same.

        // the above line means -int[] means -  this reference variable rollNo is pointing to an array object that contains
        // type integer


    }
}
