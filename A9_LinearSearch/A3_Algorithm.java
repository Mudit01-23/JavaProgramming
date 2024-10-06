package com.mj.A9_LinearSearch;

public class A3_Algorithm {
    public static void main(String[] args) {
        int[] array = {34,6,11,12,64};
        int target = 64;

        int result = linearSearch(array,target);

        if(result !=-1){
            System.out.println("Found "+ target + " at index " + result);
        }
        else{
            System.out.println(target + " not found");
        }

    }
    static int linearSearch(int[] array,int target){
        if(array.length==0){
            return -1;
        }

        for (int i = 0; i < array.length; i++) {

            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }
}
