package com.mj.conditionalsAndLoops;
import java.util.Scanner;           // It prints the list of all fibonacci numbers up till nth term
public class ListOfFibNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number till where you want to print the fibonacci number");
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int n = sc.nextInt();
        int count = 2;
        if (n==0){
            System.out.println(n+"th fibonacci number is "+ a);
            return;
        }
        System.out.println("List of all the fibonacci number till "+n+"th term are - ");
        System.out.println("1");
        while(count<=n){
            int temp = b;
            b= a+b;
            System.out.println(b);
            a=temp;
            count++;
        }
    }
}
