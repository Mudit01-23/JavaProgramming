package com.mj.A9_LinearSearch;
import java.util.Scanner;
// Enter the row and column and the array will print which element is present in that index
// Method 1: using function


//public class A9_SearchIn2DArrayQuestions {
//    public static void main(String[] args) {
//
//        int[][] array = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row number: ");
//        int row = sc.nextInt();
//        System.out.print("Enter column number: ");
//        int col= sc.nextInt();
//        int result = whichNo(array,row,col);
//        System.out.println(result+ " is present in index "+ "{"+ row+","+ col+"}");
//
//    }
//    static int whichNo(int[][] array,int row,int col){
//        return array[row][col];
//
//    }
//}


// Method 2: Doing directly

//public class A9_SearchIn2DArrayQuestions {
//    public static void main(String[] args) {
//
//        int[][] array = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row number: ");
//        int row = sc.nextInt();
//        System.out.print("Enter column number: ");
//        int col= sc.nextInt();
//        int result = array[row][col];
//        System.out.println(result+ " is present in index "+ "{"+ row+","+ col+"}");
//
//    }
//
//}


// return the maximum and minimum value inside a 2D array


public class A9_SearchIn2DArrayQuestions {
    public static void main(String[] args) {
        int[][] array = {
                {1,23,42,-13},
                {10,3,422},
                {234324},
        };
        int[] result = maxOrMin(array);
        System.out.println("The maximum number inside array is: "+ result[0]+ " and the minimum number inside array is: "+ result[1]);

    }
    static int[] maxOrMin(int[][] array){
        int maxNo = Integer.MIN_VALUE;
        int minNo = Integer.MAX_VALUE;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]>maxNo){
                    maxNo = array[row][col];
                }

                if(array[row][col]<minNo){
                    minNo = array[row][col];
                }
            }

        }
        return new int[]{maxNo,minNo};

    }
}