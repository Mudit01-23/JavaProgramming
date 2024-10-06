package com.mj.SwitchStatements;
import java.util.Scanner;               // This is the example of switch case
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a fruit");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "mango":
                System.out.println("Mango - king of fruits");
                break;

            case "apple":
                System.out.println("Apple - Sweet red fruit");
                break;                                                                                      // this is the default switch


            case "grapes":
                System.out.println("grapes - small fruit");
                break;

            default:
                System.out.println("No fruit is entered");
        }



    }
}
