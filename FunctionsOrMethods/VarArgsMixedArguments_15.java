package com.mj.FunctionsOrMethods;

import java.util.Arrays;

public class VarArgsMixedArguments_15 {                  // this program contains mixed arguements.
    public static void main(String[] args) {
        mixedArguments(1,3,"Mudit",3,4,5,6,7);
    }
    static void mixedArguments(int a, int b, String d,int ...c){
        System.out.print(a);
        System.out.print(", ");
        System.out.print(b);
        System.out.print(", ");
        System.out.print(d);
        System.out.print(", ");
        System.out.print(Arrays.toString(c));
        }
    }

