package com.mj.conditionalsAndLoops;
import java.util.Scanner;               // Find the n'th fibonacci number.
public class FibonacciTill_nth {
    public static void main(String[] args) {
            int a = 0;
            int b =1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if (n==0){
           System.out.println(n+"th fibonacci number is "+ a);
           return;
       }

        int count = 2;
        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
            System.out.println(b);
        }

        //System.out.println(n+ "th fibonacci number is " + b);


    }
}
