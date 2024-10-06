package com.mj.LeetCodeQuestions;

public class A9_Palindrome {
    public static void main(String[] args) {
        int x = 12121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        int originalNo = x;
        int reverseNo = 0;

        while (originalNo > 0) {

            int currentDigit = originalNo % 10;
            reverseNo = reverseNo * 10 + currentDigit;
            originalNo = originalNo / 10;



        }
        if (x == reverseNo) {
            return true;
        }

        return false;
    }
}
