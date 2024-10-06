package com.mj.FunctionsOrMethods;
import java.util.Arrays;

public class VariableLengthArguments_12 {
    public static void main(String[] args) {
            fun1(1,2,3);
            fun2(1,2,3);
    }
    static void fun1(int ...v){                // first method to print variable length arguments, here we are using Arrays.toString() method.
        System.out.println(Arrays.toString(v));
    }

    static void fun2(int ...v){             // second method - here we are using enhanced for loop
        for (int i:v){
            System.out.print(i + " ");
        }

    }
}
