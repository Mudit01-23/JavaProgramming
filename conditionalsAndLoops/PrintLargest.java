package com.mj.conditionalsAndLoops;
import java.util.Scanner;
public class PrintLargest {
    public static void main(String[] args) {
        // Input 3 number and print the largest of them
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1 + " is the greatest number");
//        }
//        else if(num2>num3 && num2>num1){
//            System.out.println(num2 + " is the greatest number");
//        }
//        else {
//            System.out.println(num3 +" is the greatest number");
//        }


        // Most optimised approach

        int largest = num1;

        if (num2>largest){
            largest= num2;
        }
        if(num3>largest){
            largest = num3;
        }
        System.out.println(largest + " is the largest number");

    }
}


