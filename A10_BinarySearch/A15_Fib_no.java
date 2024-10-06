package com.mj.A10_BinarySearch;
import java.util.*;

public class A15_Fib_no {
    public static void main(String[] args) {
        System.out.println("Program to print first 10 fibonacci numbers");
        int a = 0;
        int b = 1;
        System.out.println("how many fibonacci number's you want? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Enter valid number");
            return;
        }
        else if(n == 1){
            System.out.println("First "+ n+ " fibonacci numbers is: "+ "0 ");
        }

        else{
            System.out.println("First "+ n+ " fibonacci numbers are: ");
            System.out.print("0 1 ");
            for (int i = 2; i < n; i++) {

                int sum = a+b;
                a = b;
                b = sum;
                System.out.print(b+ " ");


            }
        }
    }
}