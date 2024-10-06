package com.mj.A9_LinearSearch;

public class A6_searchInInteger {


        public static void main(String[] args) {
            int[] array = {12,34,53,2,6,-4,-1};
            int target = -11;
            int result = linearSearch(array, target);

            if(result!= -1){
                System.out.println("Found "+ target + " at index "+ result);
            }
            else{
                System.out.println("Didn't find "+ target);
            }
        }

        static int linearSearch(int[] array, int target){
            if(array.length== 0){
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


