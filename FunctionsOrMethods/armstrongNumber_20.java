package com.mj.FunctionsOrMethods;
import java.util.Scanner;
public class armstrongNumber_20 {               // to check if a number is  armstrong number or not, with using a  function.
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            armstrongNumberChecker(i);
        }

    }

    static void armstrongNumberChecker(int num){
        int originalNum= num;
        int armNo = 0;
        while (num>0){

            int rem = num%10;
            int cube = rem*rem*rem;
            armNo = armNo+cube;
            num= num/10;
        }

        if(armNo == originalNum){
            System.out.println(originalNum);
        }

    }
}
