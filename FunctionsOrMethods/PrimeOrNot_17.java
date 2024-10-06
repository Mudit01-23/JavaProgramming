package com.mj.FunctionsOrMethods;
import java.util.Scanner;
public class PrimeOrNot_17 {// this is the most optimised way of writing this code - written by him.

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);

    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        int i = 2;
        while((i * i) <= num){
            if (num % i == 0 ){
                return false;
            }
            i++;

        }
        return i*i >num;
        }

    }


