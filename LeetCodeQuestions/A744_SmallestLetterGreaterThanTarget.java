
/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */

package com.mj.LeetCodeQuestions;
import java.util.Scanner;

import java.util.Arrays;

public class A744_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        //char[] letters = {'x','x','y','y'};
        char[] letters = {'c','f','j'};
        System.out.println(Arrays.toString(letters));



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        char target = sc.next().charAt(0);

        System.out.println(nextGreatestLetter(letters,target));



    }
    static char nextGreatestLetter(char[] letters, char target){

            int start = 0;
            int end = letters.length-1;


            while(start<=end){
                int mid = start + (end-start)/2;


//                 if(letters[mid]<= target){
//                    start = mid+1;
//
//                }
//                else{
//                    end = mid-1;
//                }
            // earlier i was not taking = case into account,in place of  if(letters[mid]<= target),
            // i was writing if(letters[mid]<target){start = mid+1}, else{end = mid-1}, this misses
            // the '=' case

                if(target<letters[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        return letters[start%letters.length];

    }



}
