package com.mj.FunctionsOrMethods;
import java.util.Scanner;
public class PrimeOrNot_16 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeOrNot(num);

    }

    static void PrimeOrNot(int num){
        if(num<=1){
            System.out.println(num + " is not a prime number");
        }

        int i =2;
        while ((i*i) <= num ){
            if(num%i ==0){
                System.out.println(num + " is not a prime number");
                System.out.println("It's divisors are: " );
                printAllDivisors(num);
                return;
            }
            i++;
        }
        System.out.println(num + " is a prime number");
        System.out.println("It's divisors are: " );
        printAllDivisors(num);

    }



    static void printAllDivisors(int num){

        int i = 1;
        while (i<=num){
            if(num%i==0){
                System.out.print(i+ " ");
            }
            i++;
        }

    }
}
