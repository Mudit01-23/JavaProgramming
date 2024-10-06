package com.mj.conditionalsAndLoops;
import java.util.Scanner;
public class UpperCaseOrLowerCase {
    public static void main(String[] args) {

        System.out.println("Enter any alphabet");
        Scanner sc= new Scanner(System.in);
        char alphabet= sc.next().trim().charAt(0);


        if ('z'>= alphabet && alphabet>= 'a' ){
            System.out.println(alphabet+" is in lower case ");
        }
        else if ('Z'>= alphabet && alphabet>= 'A' ){
            System.out.println(alphabet+" is in upper case ");
        }

        else{
            System.out.println(alphabet+" is neither in upper case or lower case ");
        }



    }
}
