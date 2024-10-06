package com.mj.FunctionsOrMethods;
import java.util.Scanner;               // contains a function that swaps 2 integers
public class Swap_8 {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1,num2);
        System.out.println(num1 + " "+ num2);


    }
     static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2= temp;
        System.out.println(num1+" " + num2);
    }
}
