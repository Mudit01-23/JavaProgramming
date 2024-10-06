package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;
    // Binary search interview questions

// to find the position of an element in an array.


public class A3_Testing {
    public static void main(String[] args) {
         //int[] array = {10,20,30,43,54,64,68,73,86};
        int[] array = {86,73,68,64,54,43,30,20,10};

        System.out.println(Arrays.toString(array));
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //System.out.println("The ceiling of "+ target+ " is: "+ array[binarySearch(array,target)] );
        System.out.println("index: "+ binarySearch(array,target));
        // pass the
    }

    static int binarySearch(int[] array,int target) {
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]<array[array.length-1];

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target == array[mid]){
                return mid;
            }

            if(isAscending){
                if(target>array[mid]){
                    start = mid+1;
                }
                else if (target<array[mid]){
                    end = mid-1;
                }
            }

            else{
                if(target>array[mid]){
                    end = mid-1;
                }
                else if (target<array[mid]){
                    start = mid+1;
                }
            }
        }
    return -1;
    }
}



