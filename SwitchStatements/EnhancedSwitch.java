package com.mj.SwitchStatements;
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        // This is the enhanced switch
//        System.out.println("Enter a day in a week");
        Scanner sc = new Scanner(System.in);
//        String day = sc.next();
//        switch (day) {
//
//            case "monday" -> System.out.println("1st day is monday");
//            case "tuesday" -> System.out.println("2nd day is tuesday");
//            case "wednesday" -> System.out.println("3rd day is wednesday");
//            case "thursday" -> System.out.println("4th day is thursday");
//            case "friday" -> System.out.println("5th day is friday");
//            case "saturday" -> System.out.println("6th day is saturday");
//            case "sunday" -> System.out.println("7th day is sunday");
//            default -> System.out.println("Enter a valid day");
//
//
//
//
//        }

        System.out.println("Enter a number of day");
        int day1= sc.nextInt();
        switch (day1){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
