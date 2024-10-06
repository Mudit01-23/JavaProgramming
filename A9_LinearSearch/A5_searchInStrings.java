package com.mj.A9_LinearSearch;
import java.util.Objects;
import java.util.Scanner;
//public class A5_searchInStrings {
//    public static void main(String[] args) {
//        String[] array= {"m","M","u","U","d","D","i","I","t","T"};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the target alphabet");
//        String target = sc.next();
//        int result = linearSearch(array,target);
//        if (result!=-1){
//            System.out.println("Found "+ target +" at index "+ result);
//
//        }
//    }
//    static int linearSearch(String[] array,String target){
//
//        if(array.length== 0){
//            return -1;
//        }
//        for (int i = 0; i < array.length; i++) {
//             String a= array[i];
//
//            if(a.equals(target)){
//                return i;
//            }
//        }
//
//        return -1;
//    }
//}



// One more method


public class A5_searchInStrings {
    public static void main(String[] args) {
        String[] array = {"a","b","c","d","e","mudit"};
        String target = "mudit";
        System.out.println(stringLinearSearch(array,target));

    }

    static String stringLinearSearch(String[] array, String target){
        if(array.length ==0){
            return "False";
        }

        for (int i = 0; i < array.length; i++) {
            if(target.equals(array[i])){
                return "True";
            }

        }

        return "False";
    }
}