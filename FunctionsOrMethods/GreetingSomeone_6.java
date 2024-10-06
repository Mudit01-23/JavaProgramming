package com.mj.FunctionsOrMethods;
import java.util.Scanner;                       // this program takes the name and greets it, using a void function
public class GreetingSomeone_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        greeting(name);
    }

    static void greeting(String name){
         System.out.println("Hello " + name);


    }

}
