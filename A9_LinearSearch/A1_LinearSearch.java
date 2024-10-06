package com.mj.A9_LinearSearch;

//public class A1_LinearSearch {
//    public static void main(String[] args) {
//        // check if 14 exists in the array
//        // 1st method
//        int[] array = {23,45,32,65,14};
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i]==114){
//                System.out.println(true);
//                return;
//            }
//        }
//        System.out.println(false);
//    }
//}

// 2nd method- using for each loop
public class A1_LinearSearch {
    public static void main(String[] args) {
        int[] array = {23, 45, 32, 65, 14};
        int target = 14;

        for (int num : array) {
            if (num == target) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}


