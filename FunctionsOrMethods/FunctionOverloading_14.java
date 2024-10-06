package com.mj.FunctionsOrMethods;

import java.util.Arrays;
                                                            // this is an example of function overloading. 2 conditions - either the type of arguement should be different or no of arguemnts should be different.
public class FunctionOverloading_14 {
    public static void main(String[] args) {
        func(5,3,4,23,4);
        func("Bob","Tom","Rock");
        System.out.println("#########################");
        sum(3,4);
        sum(3,4,5);
        System.out.println("#########################");
        demo(1,23,3,4,324,234,324,24,2394);
        demo("a","3","MJ","23");
    }
    static void func(int ...a ){
        System.out.println(Arrays.toString(a));
    }

    static void func(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void sum(int a,int b ) {
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c ) {
        System.out.println(a + b+c);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
  static void demo(String ...v){
 System.out.println(Arrays.toString(v));
}


}
