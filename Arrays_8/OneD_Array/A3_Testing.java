package com.mj.Arrays_8.OneD_Array;
import java.util.Arrays;
import java.util.Scanner;
public class A3_Testing {
    public static void main(String[] args) {
        // input using for loops
        System.out.println("Enter 3 strings");

     String[] str = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int  i = 0; i < str.length; i++) {
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString(str));


        }
    }

