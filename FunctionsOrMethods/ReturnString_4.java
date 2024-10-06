package com.mj.FunctionsOrMethods;
import java.util.Scanner;                                        // will return string
public class ReturnString_4 {
    public static void main(String[] args) {
        String n= greeting();
        System.out.println("Hello "+ n+", nice to meet you!!!");


//        **********this portion can also work like this -*******************
//            The greeting() method will run before the string concatenation and the input will replace the sout.
//        System.out.println("Hello "+ greeting()+", nice to meet you!!!");


    }

    static String greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }
}
