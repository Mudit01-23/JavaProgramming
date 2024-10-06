package com.mj.A10_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;


//        // BinarySearch in ascending order.
//public class A1_BinarySearchAlgorithm {
//    public static void main(String[] args) {
//       int[] array = {-5,-4,-3,-2,-1,0};
//        System.out.println(Arrays.toString(array));
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//
//       int target = sc.nextInt();
//       int index = binarySearch(array, target);
//        System.out.println(index);
//
//    }
//
//    // return the index
//    // if target not found in array, return -1

//    static int binarySearch(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        while(start<=end){
//            // find the middle element
//            int middle= start + (end-start)/2;
//
//           if(target<array[middle]){
//               end = middle-1;
//           }
//           else if (target > array[middle]){
//               start = middle+1;
//           }
//           else{
//               return middle;
//           }
//
//        }
//
//        return -1;
//    }
//
//}

        // BinarySearch in descending order.



//public class A1_BinarySearchAlgorithm{
//    public static void main(String[] args) {
//         int[] array = {5,4,3,2,1,0,-1,-2,-3};
//
//        int target = -3;
//
//        System.out.println(binarySearch(array,target));
//    }
//
//    static int binarySearch(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//
//
//        while(start<=end){
//            int mid = start+ (end-start)/2;
//
//            if(target>array[mid]){
//
//                end = mid-1;
//
//
//            }else if (target<array[mid]){
//                start = mid+1;
//
//            }else{
//                return mid;
//            }
//
//        }
//        return -1;
//    }
//}



// Combining these 2 together



//public class A1_BinarySearchAlgorithm{
//    public static void main(String[] args){
//       //  int[] array = {7,6,5,4,3,2,1};
//        int[] array = {1,2,3,4,5,6};
//
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        if(array[0]<= array[array.length-1]){
//            System.out.println(binarySearchAscending(array,target));
//        }
//        else{
//            System.out.println(binarySearchDescending(array,target));
//        }
//
//
//    }
//    static int binarySearchAscending(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        while(start<=end){
//            // find the middle element
//            int middle= start + (end-start)/2;
//
//           if(target<array[middle]){
//               end = middle-1;
//           }
//           else if (target > array[middle]){
//               start = middle+1;
//           }
//           else{
//               return middle;
//           }
//
//        }
//
//        return -1;
//    }
//
//    static int binarySearchDescending(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        while(start<=end){
//            // find the middle element
//            int middle= start + (end-start)/2;
//
//            if(target<array[middle]){
//                start = middle+1;
//            }
//            else if (target > array[middle]){
//                end = middle-1;
//            }
//            else{
//                return middle;
//            }
//
//        }
//
//        return -1;
//    }
//}
//


// This is the perfect, completely optimised binary search algo



// Binary search interview questions



public class A1_BinarySearchAlgorithm {
    public static void main(String[] args) {
        //int[] array = {10,20,30,43,54,64,68,73,86};
        int[] array = {86,73,68,64,54,43,30,20,10};

        System.out.println(Arrays.toString(array));
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //System.out.println("The ceiling of "+ target+ " is: "+ array[binarySearch(array,target)] );
        System.out.println("index: "+ binarySearch(array,target));
        // pass the
    }

    static int binarySearch(int[] array,int target) {
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]<array[array.length-1];

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target == array[mid]){
                return mid;
            }

            if(isAscending){
                if(target>array[mid]){
                    start = mid+1;
                }
                else if (target<array[mid]){
                    end = mid-1;
                }
            }

            else{
                if(target>array[mid]){
                    end = mid-1;
                }
                else if (target<array[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}



