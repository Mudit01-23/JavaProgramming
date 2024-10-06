package com.mj.conditionalsAndLoops;
import java.util.Scanner;

public class PersonalizedMessage {
    public static void main(String[] args) {
        // one method
//        String personalizedMessage = greeting("Mudit Joshi");
//        System.out.println(personalizedMessage);

        // other method
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String nameFromUser= sc.nextLine();
        String personalizedMessage = greeting(nameFromUser);
          System.out.println(personalizedMessage);
    }


    static String greeting(String name) {
        String message = "Hello "+ name;
        return message;


    }

}