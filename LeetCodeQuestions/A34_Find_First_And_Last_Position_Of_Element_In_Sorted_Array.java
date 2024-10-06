package com.mj.LeetCodeQuestions;
import java.util.Scanner;
import java.util.Arrays;


// Part 1: using the brute force approach by applying linear search


//public class A34_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
//
//    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(nums));
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//
//        System.out.println(Arrays.toString(searchRangeLinearSearch(nums, target)));
//
//
//
//
//    }
//
//    public static int[] searchRangeLinearSearch(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//        int rangeFromFront = -1;
//        int rangeFromBack = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                rangeFromFront = i;
//                break;
//            }
//        }
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] == target) {
//                rangeFromBack = i;
//                break;
//            }
//        }
//        return new int[]{rangeFromFront, rangeFromBack};
//    }
//
//
//}


// ******************************************************************************************************************



// using the binary search approach, this code is written by me


//public class A34_Find_First_And_Last_Position_Of_Element_In_Sorted_Array{
//        public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(nums));
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//
//        System.out.println(Arrays.toString(binarySearch(nums, target)));
//
//
//
//
//    }
//
//
//
//
//    public static int[] binarySearch(int[] nums,int target) {
//        return new int[]{binarySearchFromFront(nums,target), binarySearchFromBack(nums,target)};
//
//    }
//
//
//    public static int binarySearchFromFront(int[] nums, int target){
//        int start = 0;
//        int end = nums.length-1;
//        int ans = -1;
//        while(start <= end){
//            int mid = start + (end-start)/2;
//            if(nums[mid]< target){
//                start = mid+1;
//            }
//            else if (nums[mid]> target){
//                end = mid-1;
//            }
//            else{
//                ans = mid;
//
//                end = mid-1;
//            }
//        }
//        return ans;
//
//    }
//
//
//
//    public static int binarySearchFromBack(int[] nums, int target){
//        int start = 0;
//        int end = nums.length-1;
//        int ans = -1;
//        while(start <= end){
//            int mid = start + (end-start)/2;
//            if(nums[mid]< target){
//                start = mid+1;
//            }
//            else if (nums[mid]> target){
//                end = mid-1;
//            }
//            else{
//                ans = mid;
//                start = mid+1;
//            }
//        }
//        return ans;
//
//    }
//
//
//}



// ******************************************************************************************************************


// the best method to solve this type of question using binary search


public class A34_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(nums));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int[] answer = {-1,-1};

        answer[0]= binarySearch(nums,target,true);
        answer[1] = binarySearch(nums,target,false);

        System.out.println(Arrays.toString(answer));

    }


    static int binarySearch(int[] nums,int target,boolean findFirstIndex){

        int start = 0;
        int end = nums.length-1;
        int answer = -1;


        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]>target){
                end = mid-1;
            }else{
                answer = mid;
                if(findFirstIndex){
                    end = mid-1;
                }

                else{
                    start = mid+1;

                }

            }
        }
        return answer;


    }

}



// ******************************************************************************************************************
// Q- find the position of an element in a sorted array of infinite numbers
// which means that we can't take the arr.length to get the size
// this can be solved using 2 methods- brute force approach and linear search

// 1- Brute force approach-

//
//public class A34_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
//    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19};
//
//        int target = 18;
//
//        System.out.println("Index: "+ linearSearch(nums,target));
//
//    }
//    public static int linearSearch(int[] nums,int target) {
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//}

// 2- binary search approach, since we don't know what is end of the array, we can take array chunks and then solve this

//public class A34_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
//    public static void main(String[] args) {
//        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
//        int target = 15;
//        System.out.println(binarySearch(nums, target));
//    }
//
//
//
//    public static int findTheIndex(int[] nums, int target){
//        int start = 0;
//
//        int end = 10;
//        int mid = 0;
//        while (target == mid){
//            binarySearch(nums,target);
//            start = end + 1;
//            end = start + 10;
//        }
//        return -1;
//    }
//    public static int binarySearch(int[] nums, int target) {
//        int start = 0;
//
//        int end = 10;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//            if (nums[mid] == target) {
//                return mid;
//
//
//            } else if (nums[mid] < target) {
//                start = mid + 1;
//
//            } else {
//                end = mid - 1;
//
//            }
//            start = end + 1;
//        }
//
//
//        return -1;
//    }
//
//}









