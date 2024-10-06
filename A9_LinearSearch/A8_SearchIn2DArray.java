package com.mj.A9_LinearSearch;
import java.util.Scanner;
import java.util.Arrays;


// Q1- Searching an integer (using long method to print the index of the element)

//public class A8_SearchIn2DArray {
//    public static void main(String[] args) {
//        int[][] array = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col]+ " ");
//            }
//            System.out.println();
//        }
//
//
//
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        linearSearch(array,target);
//
//
//
//    }
//    static void linearSearch(int[][] array,int target){
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                if(target == array[row][col]){
//                    System.out.println(target + " is present in index: "+"{"+row+","+ col+ "}");
//                    return;
//                }
//            }
//
//        }
//        System.out.println(target + " is not present inside the array" );
//
//    }
//}




// Q2- Searching an integer (using short method by directly returning the array containing element position)



public class A8_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]+ " ");
            }
            System.out.println();
        }



        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] answer = linearSearch(array,target);
        if(answer[0] == -1){
            System.out.println(target+ " is not present inside array");
        }
        else{
            System.out.println(target + " is present in index:"+ Arrays.toString(answer));
        }



    }

    static int[] linearSearch(int[][] array,int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (target == array[row][col]) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1};

    }
}



// Q3- Searching a character/String;

//public class A8_SearchIn2DArray {
//    public static void main(String[] args) {
//        char[][] array= {
//                {'a','b','c'},
//                {'d','e','f'},
//                {'g','h','i'},
//
//        };
//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }
//
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        char target = sc.next().charAt(0);
//        linearSearch(array,target);
//    }
//    static void linearSearch(char[][] array,char target){
//
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                if(array[row][col]==target){
//                    System.out.println(target + " is present at index "+ "{"+row+","+col+"}");
//                    return;
//                }
//            }
//        }
//        System.out.println(target + " is not present inside array");
//
//    }
//}