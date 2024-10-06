package com.mj.FunctionsOrMethods;
import  java.util.Scanner;
public class PrintSum_1 {                               // takes the number and prints the sum
    public static void main(String[] args) {
        sum();

    }

    static  void  sum(){
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int c = num1+num2;
        System.out.println(num1 +" + "+num2 +" = "+ c);
    }
}
