package com.mj.conditionalsAndLoops;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int answer =  sum2();
        System.out.println(answer);
        // function that sums two numbers

    }

        static  void sum()  {
        int num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1= in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        int sum = num1+num2;
            System.out.println("Sum: "+ sum);
    }

    // return the value
static int sum2(){
    int num1,num2;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter num1: ");
    num1= in.nextInt();
    System.out.print("Enter num2: ");
    num2 = in.nextInt();
    int sum = num1+num2;
   return sum;

}

}