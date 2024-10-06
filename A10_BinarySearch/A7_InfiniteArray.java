package com.mj.A10_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// 2- binary search approach, since we don't know what is end of the array, we can take array chunks and then solve this

public class A7_InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target = 15;
        int start=0;
        int end= 10;

        System.out.println(binarySearch(nums, target, start ,end));


    }

    public static int ans(int[] nums,int target){
        // First search with box of size 2;
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int newStart = end +1;

            end = end + (end-start+1)*2;

        }

    return -1;
    }

    public static int binarySearch(int[] nums, int target,int start ,int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;


            } else if (nums[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
            start = end + 1;
        }


        return -1;
    }

}