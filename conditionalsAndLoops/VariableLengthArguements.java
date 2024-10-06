package com.mj.conditionalsAndLoops;

import java.util.Arrays;

public class VariableLengthArguements {
    public static void main(String[] args) {

        // When we don't know how many inputs we are giving. Syntax = int/string ...(variable)
        fun(1,3,45,5,3423,532);
        System.out.println("**************");
        test("Mudit","Anmol","Hello","Hii") ;
        System.out.println("**************");
        Multiple(4,2,"Mudit ","Joshi");

    }
    static  void fun(int ...y){
        System.out.println(Arrays.toString(y));

    }
    static void test(String ...s){
        System.out.println(Arrays.toString(s));

    }


    // Multiple arguements
    static void Multiple(int a,int b,String ...x){
        System.out.println(Arrays.toString(x));
    }
}
