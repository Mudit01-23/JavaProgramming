package com.mj.A10_BinarySearch;

import java.util.*;

public class A15_CeilingAndFloor {
    public static void main(String[] args) {
        int[] array = {5,10,15,20,25,30};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int floor = floor(array, target);
        int ceiling = ceiling(array, target);
        System.out.println("The floor and ceiling of "+target +" is : "+ "{"+ floor + ceiling+  "}");
    }

    public static int floor(int[] array,int target ){
        if(target<array[0] || target >array[array.length-1]){
            return -1;
        }

        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]<array[array.length-1];


        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]== target){
                return array[mid];
            }
            else if(array[mid]< target){
                if(isAscending){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            else {
                if(isAscending){
                    end = mid-1;
                }
                else{
                    start = mid+1;

                }

            }
        }
        return array[end] ;
    }

    public static int ceiling(int[] array,int target ){
        if(target<array[0] || target >array[array.length-1]){
            return -1;
        }

        int start = 0;
        int end = array[array.length-1];
        boolean isAscending = array[0]<array[array.length-1];


        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]== target){
                return array[mid];
            }
            else if(array[mid]< target){
                if(isAscending){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            else {
                if(isAscending){
                    end = mid-1;
                }
                else{
                    start = mid+1;

                }

            }
        }
        return array[start] ;
    }

}
