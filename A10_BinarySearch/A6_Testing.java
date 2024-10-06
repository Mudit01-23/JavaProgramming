package com.mj.A10_BinarySearch;

// to print the first and last of position of an element inside an array

import java.util.Arrays;
import java.util.Scanner;
public class A6_Testing {
    public static void main(String[] args) {
        int[] array = {10,10,15,15,15,20,20,20,20,25,30};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] answer = firstAndLastPosition(array,target);
        System.out.println("The first and last position of "+target + " is "+ answer[0]+" and"+ answer[1]);
    }
    public static int[] firstAndLastPosition(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(array[mid]<target){
            start = mid+1;
            }
        else if (array[mid]>target){
            end = mid-1;
            }
        else{
            //return start;
            }
        }

        return new int[]{-1,-1};

    }
}
