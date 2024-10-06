package com.mj.conditionalsAndLoops;

public class Scope {

    public static void main(String[] args) {
        int a =2;
        int b =3;
        {
            // --> This is block scoping.
            // int a = 3;              // --> a is already initialized outside the block, can't be initialized again.
            a = 100;                // --> but we can change the value.
            int c = 20;           //  --> The values initialised in this block will remain in this block only.
        }
       // c = 30;     // --> cannot use outside the block.



        // scoping in for loops

        for(int i = 0;i<4;i++){
            System.out.println(i);
        }

       // System.out.println(i);         //  ---> Cannot access this i outside the for loop.

    }
    static void random(){
       int  a = 10;
        System.out.println(a);
    }



}
