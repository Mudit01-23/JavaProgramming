package com.mj.FunctionsOrMethods;

public class VariableLengthArguments_10 {
    // Here in variable-length arguments, we don't know how many inputs we are giving
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);  // Calling the function with multiple arguments
        fun(10, 20);  // Calling the function with fewer arguments
    }

    static void fun(int... v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
}
