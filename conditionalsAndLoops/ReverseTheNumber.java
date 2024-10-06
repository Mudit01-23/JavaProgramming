package com.mj.conditionalsAndLoops;
import  java.util.Scanner;      // Reverse the entered number
public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int realNum = num;
        int revNum = 0;

       while(num>0){
           int pointer = num%10;
            revNum = revNum*10+pointer;
            num=num/10;
       }
        System.out.println("The reverse of "+ realNum+" is: " + revNum);
    }
}
