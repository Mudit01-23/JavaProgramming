package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class A8_Testing{
    public static void main(String[] args ){
        int[] array = {10,10,10,10,20,20,30,30,30};
       System.out.println(Arrays.toString(array));
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int target = sc.nextInt();
        int[] ans=  firstAndLastPosition(array,target);
        System.out.println("The first and last position of "+ target+ " is "+ ans[0]+ " and "+ ans[1] );

    }

     static int[] firstAndLastPosition(int[] array,int target){
        int start = 0;
        int end = array.length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]< target ){
                start = mid+1;
            }
            else if(array[mid]> target){
                end = mid-1;
            }
            else{

            }
        }
        return new int[]{-1,-1};
    }
}