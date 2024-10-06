package com.mj.conditionalsAndLoops;

public class shadowing {
   static int x = 90;   // --> static is object independent,we can't use object dependent things inside an object independent things

    // also this x = 90 will be shadowed.

    public static void main(String[] args) {

        // main shadowing stuff - when we add another variable in scope that overlaps, the variable with the higher level scope will be hidden

        System.out.println(x);      // will print 90,
        int x = 30; // the class variable at line no 4 is shadowed by this
        System.out.println(x);      // will print 30

    }

    static void fun(){
        System.out.println("********************");
        System.out.println(x);
    }

}
