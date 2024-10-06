package com.mj.Arrays_8.multidimensionalArray;
import java.util.Arrays;
import java.util.Scanner;


// swapping the numbers inside array
//
//public class A7_ArraysQuestion {
//    public static void main(String[] args) {
//        // Q 1- Swap the indices
//        int[] array = new int[4];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 4 numbers in an array");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//
//
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Enter the 1st index to swap");
//        int index1 = sc.nextInt();
//        System.out.println("Enter the 2nd index to swap");
//        int index2 = sc.nextInt();
//        swap(index1,index2,array);
//        System.out.println(Arrays.toString(array));
//    }
//
//        static void swap(int index1,int index2,int[] array){
//          int temp = array[index1];
//          array[index1] = array[index2];
//          array[index2] = temp;
//
//        }
//    }


    // maximum  and minimum number inside array


//
//public class A7_ArraysQuestion {
//    public static void main(String[] args) {
//        System.out.println("Enter the array");
//        Scanner sc = new Scanner(System.in);
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//        int[] result = maxAndMin(array);
//        int max = result[0];
//        int min  = result[1];
//        System.out.print("The maximum number inside the array: " + Arrays.toString(array) + " is: "+ max + " and minimum number inside the array is: "+ min);
//
//    }
//
//    static int[] maxAndMin(int[] array){
//        int maxNo= array[0];
//        int minNo = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]>=maxNo){
//                maxNo = array[i];
//            }
//
//            if(array[i]<=minNo){
//                minNo = array[i];
//            }
//
//        }
//        int[] result = {maxNo,minNo};
//        return result;
//
//    }
//}


// Reverse the array(my attempt)

//public class A7_ArraysQuestion {
//    public static void main(String[] args) {
//        int[] array = new int[4];
//        System.out.print("Enter the array:");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("The array is:" + Arrays.toString(array));
//        System.out.print("The reverse of array is:" );
//        arrayReverse(array);
//    }
//
//    static void arrayReverse(int[] array){
//        int start = array[0];
//        int end = array[array.length-1];
//
//        }
//
//    }
//}

// his method (have to understand)

public class A7_ArraysQuestion {
    public static void main(String[] args) {
        int[] array = {2,54,52,3,46,29,64};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverse(int[] arr){
            int start = 0;
            int end = arr.length-1;

            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
    }

    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}