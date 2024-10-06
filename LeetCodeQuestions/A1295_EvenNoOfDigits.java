package com.mj.LeetCodeQuestions;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

//
//        Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//                Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//                Therefore only 12 and 7896 contain an even number of digits.
//        Example 2:
//
//        Input: nums = [555,901,482,1771]
//        Output: 1
//        Explanation:
//        Only 1771 contains an even number of digits.
//
//
//        Constraints:
//
//        1 <= nums.length <= 500
//        1 <= nums[i] <= 105



//
//
//public class A1295_EvenNoOfDigits {
//
//    public static void main(String[] args) {
//        int[] nums = {437,315,322,4831,686,264,442};
//        System.out.println(evenCounter(nums));
//
//
//    }
//
//    static int evenCounter(int[] nums) {
//
//        int mainCounter = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int counter = 0;
//
//            int digit = nums[i];
//
//            while (digit > 0) {
//                digit = digit / 10;
//                counter++;
//
//            }
//            if (counter % 2 == 0) {
//                mainCounter++;
//            }
//
//        }
//        return mainCounter;
//
//    }
//}



// one more method to do the question


//
//public class A1295_EvenNoOfDigits{
//    public static void main(String[] args) {
//        int[] nums = new int[]{23,42,32,54,23,2345,234323,34244231,43,3354};
//
//        System.out.println(evenCounter(nums));
//
//    }
//    static int evenCounter(int[] nums){
//        int counter = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            int currentNo= nums[i];
//            String convertToString = String.valueOf(currentNo);
//            int numLength = convertToString.length();
//            if(numLength%2==0){
//                counter++;
//            }
//        }
//
//            return counter;
//    }
//}





// One more method


public class A1295_EvenNoOfDigits{
    public static void main(String[] args) {
        int[] nums = new int[]{23,42,32,54,23,2345,234323,34244231,43,3354};

        System.out.println(evenCounter(nums));

    }
    static int evenCounter(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {

            int currentNo= nums[i];
            String convertToString = currentNo+"";
            int numLength = convertToString.length();
            if(numLength%2==0){
                counter++;
            }
        }

            return counter;
    }
}

