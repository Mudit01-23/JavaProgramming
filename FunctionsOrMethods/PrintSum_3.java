package com.mj.FunctionsOrMethods;
import java.util.Scanner;                                // prints sum by passing arguements using static int, here fxn is returning something, the return type is int
public class PrintSum_3 {
    public static void main(String[] args) {
        System.out.println("Enter num1:");
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        System.out.println(num1+"  + "+num2+ " = "+sum(num1,num2));
    }

    static int  sum(int a,int b){
        int c  = a+b;
        return c;
    }
}
