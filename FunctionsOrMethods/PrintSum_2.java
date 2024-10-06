package com.mj.FunctionsOrMethods;
import java.util.Scanner;                                // prints sum by passing arguements using static void , here return type is void, function is not returning anything.
public class PrintSum_2 {                               // pass the value of number when we are calling the function
    public static void main(String[] args) {
        System.out.println("Enter num1:");
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        sum(num1,num2);
    }

                    // here int a and int b are the parameters
    static void sum(int a,int b){
        int c  = a+b;
        System.out.println(a+"  + "+b+ " = "+c );
    }
}
