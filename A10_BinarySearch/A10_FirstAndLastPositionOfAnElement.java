package com.mj.A10_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class A10_FirstAndLastPositionOfAnElement {
    public static void main(String[] args) {


                int[] array = {10,10,10,10,10,20,20,20,30,40,40,40,40,40};

                System.out.println(Arrays.toString(array));
                System.out.print("Enter target: ");
                Scanner sc = new Scanner(System.in);
                int target = sc.nextInt();
                int ceiling = ceiling(array,target);
                int floor = floor(array,target);
                System.out.println("The floor and ceiling of the number is "+ floor+ " and "+ ceiling + " respectively");
            }

            public static int ceiling(int[] array,int target){
                int start = 0;
                int end = array.length-1;
                boolean isAscending = array[0]< array[array.length-1];

                while(start <=end ){
                    int mid = start+ (end-start)/2;
                    if(array[mid]== target){
                        return start;
                    }
                    else if(array[mid]<target){
                        start= mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
                return -1;
            }


    public static int floor(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]< array[array.length-1];

        while(start <=end ){
            int mid = start+ (end-start)/2;
            if(array[mid]== target){
                return end;
            }
            else if(array[mid]<target){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


        }

