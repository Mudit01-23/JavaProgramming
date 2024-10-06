package com.mj.LeetCodeQuestions;

 // https://leetcode.com/problems/two-sum/description/

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

import java.util.Arrays;

class A1_TwoSum {

    public static void main(String[] args) {
        int[] nums= {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int currentNo = nums[i];
            for (int j = i+1; j < nums.length; j++) {           //earlier it was j = 1
                if(currentNo+ nums[j]== target){
                    return new int[]{i,j};


                }
            }
        }

        return new int[]{-1};

    }
}

