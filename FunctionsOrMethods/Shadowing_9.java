package com.mj.FunctionsOrMethods;

public class Shadowing_9 {

    static int temp;                // this is class level variable (also known as an instance variable or field)
    public static void main(String[] args) {

         temp = 10;
        System.out.println("temp:"+temp);
        System.out.println("####################");
        testing();
        System.out.println("Now,temp will be updated due to testing() function:"+temp);
        System.out.println("Now we are going to use, shadowing, this new variable temp will override the temp variable in line 5 ");
        int temp = 500;
        System.out.println(temp);



    }

    static void testing(){
         temp =110;
        System.out.println("temp:"+ temp);
    }

}
