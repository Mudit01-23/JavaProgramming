package com.mj.FunctionsOrMethods;

public class VariableLengthArguments_13 {              // variable length arguments iterating over Strings instead of int.
    public static void main(String[] args) {
        fun("Mudit J","Bob Marley", "Donald Trump");
    }
    static void fun(String ...v){
        for (String i : v){
            System.out.println(i);
        }
    }
}
