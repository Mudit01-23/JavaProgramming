package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;
//    // Binary search interview questions
//
// ceiling and floor of a number of a number


// apply normal binary search, find the target, if the target is not present,
// increase the target and apply binary search again, if that is present then that is the cieling of the number


public class A4_Questions {
    public static void main(String[] args) {
      // int[] array = {10,20,30,43,54,64,68,73,86};
       int[] array = {86,73,68,64,54,43,30,20,10};

        System.out.println(Arrays.toString(array));
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
       int target = sc.nextInt();
        //System.out.println("The ceiling of "+ target+ " is: "+ array[binarySearch(array,target)] );
        System.out.println("index: "+ binarySearch(array,target));
        // pass the
    }

    static int binarySearch(int[] array,int target){

        int start = 0;
        int end = array.length-1;

        boolean isAscending = array[0]<array[array.length-1];

        while(start<=end){
             int mid = start+ (end-start)/2;

             if(target==array[mid]){
                 return mid;
             }

             if(isAscending){

                 if(target<array[mid]){
                     end = mid-1;
                 }else {
                     start = mid+1;
                 }
             }

             else {
                 if(target>array[mid]){
                    start = mid+1;
                 }else{
                     end = mid-1;
                 }
             }

        }
       return -1;
    }
}



//
//public class A4_Questions {
//    public static void main(String[] args) {
//        int[] array = {10, 20, 30, 43, 54, 64, 68, 73, 86};
//        System.out.println(Arrays.toString(array));
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        System.out.println("The ceiling of " + target + " is: " + findCeiling(array, target));
//    }
//
//    static int findCeiling(int[] array, int target) {
//        int start = 0;
//        int end = array.length - 1;
//
//        if (target > array[end]) {
//            // If the target is greater than the largest element, there's no ceiling.
//            return -1;
//        }
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (array[mid] == target) {
//                return array[mid];
//            } else if (target < array[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        // At the end of the loop, start points to the smallest number greater than the target.
//        return array[start];
//    }
//}


