package com.mj.conditionalsAndLoops;
import java.util.Scanner;           // this program counts the number of times a particular number occurs in
                                                        // the series of digits
public class CountingNumberOccurrences {
    public static void main(String[] args) {
        int counter =0;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the digit whose occurance you want to check in this number");
        int digit = sc.nextInt();
        int OriginalNumber = number;
        while(number>0){
            int remainder = number%10;

            if(remainder==digit){
                counter+=1;
            }
            number = number/10;
        }

        System.out.println("Digit:"+ digit+" has occured "+ counter + " times in the number:"+ OriginalNumber);

    }

                                                            public static class OddOrEven {
                                                                public static void main(String[] args) {
                                                                    System.out.println("To check if a number is old or even");
                                                                    System.out.println("Enter a number");
                                                                   Scanner  sc = new Scanner(System.in);
                                                                    int a = sc.nextInt();
                                                                    if(a==0){
                                                                        System.out.println("0 is an even number");
                                                                    }
                                                                    else if (a%2==0){
                                                                        System.out.println(a+" is an even number");
                                                                    }
                                                                    else{
                                                                        System.out.println(a+" is an odd number");
                                                                    }

                                                                }
                                                            }

                                                            public static class PrimeOrNot {
                                                                public static void main(String[] args) {
                                                                    System.out.println("Program to check if a number is prime or not");
                                                                    System.out.println("Enter a number");
                                                                    Scanner sc = new Scanner(System.in);
                                                                    int num = sc.nextInt();

                                                                    if (num<2){
                                                                        System.out.println(num + " is not a prime number");
                                                                        return;
                                                                    }

                                                                    int div= 2;

                                                                    while(div*div<=num){
                                                                        if(num%div==0){
                                                                            System.out.println(num + " is not a prime number");
                                                                            return;
                                                                        }
                                                                        else{
                                                                            div++;
                                                                        }




                                                                    }
                                                                    System.out.println(num + " is a prime number");

                                                                    }
                                                                }

                                                            // here we will print list of all available divisors
                                                            public static class PrintAllDivisors {
                                                                public static void main(String[] args) {
                                                                    System.out.println("Program to print all the divisors");
                                                                    System.out.println("Enter a number whose divisors you want");

                                                                    Scanner sc = new Scanner(System.in);
                                                                    int num = sc.nextInt();
                                                                    System.out.println("The divisors are : ");
                                                                    int div = 1;
                                                                    while (div<=num){
                                                                        if(num%div==0){
                                                                            System.out.println(div);

                                                                        }
                                                                        div++;
                                                                    }
                                                                }
                                                            }

                                                            public static class Testing1{
                                                                public static void main(String[] args) {
                                                                    System.out.println("To check if a number is prime or not");
                                                                    System.out.println("Enter a number");
                                                                    Scanner sc = new Scanner(System.in);
                                                                    int num = sc.nextInt();

                                                                    if (num<2){
                                                                        System.out.println(num+ " is not a prime number");
                                                                        return;
                                                                    }
                                                                    int div = 2;
                                                                    while (div <=  num/2){

                                                                        if(num%div==0){
                                                                            System.out.println(num+ " is not a prime number");
                                                                            return;
                                                                        }
                                                                        div++;
                                                                    }
                                                                    System.out.println(num + " is a prime number");
                                                                }

                                                            }

                                                            public static class Testing2{
                                                                public static void main(String[] args) {
                                                                    System.out.println("Program to check if a number is prime or not");
                                                                    System.out.println("Enter a number");
                                                                    Scanner sc = new Scanner(System.in);
                                                                    int num = sc.nextInt();

                                                                    if (num<2){
                                                                        System.out.println(num + " is not a prime number");
                                                                        return;
                                                                    }

                                                                    int div = 2;
                                                                    while(div<=num/2){
                                                                        if (num%div==0){
                                                                            System.out.println(num + " is not a prime number");
                                                                            return;

                                                                        }
                                                                        div++;

                                                                    }
                                                                    System.out.println(num + " is a prime number");

                                                                }

                                                            }
                                                        }
