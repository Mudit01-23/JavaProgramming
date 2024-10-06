package com.mj.conditionalsAndLoops;

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
       // greeting();          // <- this is function call, it's value is going to be whatever we return in greeting function.
        String toPrint = greeting1("hello everyone");
        System.out.println(toPrint);

    }

    static void greeting(){             // noting to return
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello "+ name);
    }

// if you want to pass the greeting
    static String greeting1(String greet){
        String g = greet;
        return g;

    }

}
