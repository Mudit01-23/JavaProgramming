package com.mj.conditionalsAndLoops;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
            fun(40);
            fun("M");
            fun(23,324,353);

            fun(1,2,3,4,55,5,3);
            fun("Mudit","Anmol","Mummy","Papa");

//            char c = 'a';
//        System.out.println(c);
    }       // fxn overloading- 2 or more functions of a same name can exist if the parameters/arguments are different or same type of arguements but different no. or arguments.
    // which function to run is decided at compile time.
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a,int b,int c ){
        System.out.println(a + " " + b + " "+ c);
    }

    static void  fun(int ...a){
        System.out.println(Arrays.toString(a));

    }

    static void  fun(String ...a){
        System.out.println(Arrays.toString(a));

    }
}
