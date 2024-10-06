package com.mj.FunctionsOrMethods;
import java.util.Scanner;

public class Testing { // to check if a number is an armstrong number or not, using a function
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("List of all Armstrong numbers from 1 to " + num + " are:");
        for (int i = 1; i <= num; i++) {
            armstrongNumberChecker(i);
        }
    }

    static void armstrongNumberChecker(int num) {
        int originalNum = num;
        int armNo = 0;

        // Copy the num to temp variable to preserve originalNum for comparison
        int temp = num;

        while (temp > 0) {
            int rem = temp % 10;
            int cube = rem * rem * rem;
            armNo = armNo + cube;
            temp = temp / 10;
        }

        if (armNo == originalNum) {
            System.out.println(originalNum);
        }
    }
}