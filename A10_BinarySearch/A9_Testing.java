package com.mj.A10_BinarySearch;
import java.util.Arrays;
import java.util.Scanner;



// the best method to solve this type of question using binary search


public class A9_Testing {
    public static void main(String[] args) {
        //int[] array = {10,20,30,40};
        int[] array = {40,30,20,10};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int answer = binarySearch(array,target);
        System.out.println(answer);
    }
    public static int binarySearch(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]< array[array.length-1];

        while(start <=end ){
            int mid = start+ (end-start)/2;
            if(array[mid]== target){
                return mid;
            }
            else if(array[mid]<target){
                if(isAscending){
                    start= mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(isAscending){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
