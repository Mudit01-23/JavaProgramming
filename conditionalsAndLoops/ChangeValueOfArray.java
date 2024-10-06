package com.mj.conditionalsAndLoops;

import java.util.Arrays;

public class ChangeValueOfArray {
    public static void main(String[] args) {
        // create an array
        int[] array = {1, 2, 3, 4, 5, 6};
        change(array);
        System.out.println(Arrays.toString(array));


    }

    private static void  change(int[] nums) {
        nums[0]=100;
    }

}
