package com.mj.FunctionsOrMethods;
import java.util.Scanner;                                       // same as the previous code, here the return type of function is String.
public class GreetingSomeone_7 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String personalized = greeting(name);
        System.out.println(personalized);


    }

    static String greeting(String name){
        String j ="Hello " + name;
        return j;

    }
}
