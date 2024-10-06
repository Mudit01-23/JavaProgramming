package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

/*
    ceiling - smallest number greater than or equal to the target number -> return start
    floor - biggest number smaller than or equal to the target number -> return end
*/



    /* this is a simple binary search program which has a while condition
        while(start<=end), in our case during the 2nd interation, start = mid+1= 0+1=1 and
        end = 0,
        which means start > end, and so the while condition is violated, earlier the
        situation was something like this - start< target <end but now the condtion becomes
        like this - end < target < start, here we can see that the smalllest element greater than target
        is start and the greatest element smaller than target is end
*/

public class A5_CeilingAndFloor {
    public static void main(String[] args) {

       // int[] array = {10,13,27,32,45,52,63,72,81};
        int[] array = {81,72,63,52,45,32,27,13,10};

        System.out.println(Arrays.toString(array));
        System.out.print("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] ceilingAndFloor = ceilingAndFloorCalculator(array,target);

        int ceiling= ceilingAndFloor[0];
        int floor= ceilingAndFloor[1];
        System.out.println("The ceiling of "+target+ " is: "+ceiling+" and floor is: "+ floor);
        //System.out.println(ceilingAndFloor);

    }

    static int[] ceilingAndFloorCalculator(int[] array,int target){
        int start=0;
        int end = array.length-1;
        boolean ascending = array[0]< array[array.length-1];

        if(ascending){
            if(target>array[array.length-1] || target<array[0]){
                return new int[]{-1,-1};
            }
        }
        else{
            if(target<array[array.length-1] || target>array[0]){
                return new int[]{-1,-1};
            }
        }

        //int[] answerStore;


        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==array[mid]) {
                //answerStore[0]= mid;
                return new int[]{array[mid],array[mid]};
            }

            if(ascending){

                 if(target>array[mid]){
                     start = mid+1;
                 }
                 else{
                     end = mid-1;
                 }

                }

                else{
                    if(target>array[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }



        }
        if(ascending){
            return new int[]{array[start],array[end]};

        }
        else{
            return new int[]{array[end],array[start]};
        }



    }
}
