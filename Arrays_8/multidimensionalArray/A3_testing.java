//package com.mj.Arrays_8.multidimensionalArray;
//
//import java.util.Arrays;
//
//public class A3_testing {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//    }
//}
//import java.util.Scanner;
//
//
//package com.mj.Arrays_8.multidimensionalArray;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class A3_testing {
//    public static void main(String[] args) {
//        String[] arr = new String[3];
//        System.out.println("Enter 3 names");
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] =sc.next();
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
//
//
//
//package com.mj.Arrays_8.multidimensionalArray;
//// experiments with 2d arrays
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class A3_testing{
//    public static void main(String[] args) {
////         array = new int [][];
//        int[][] array = {
//                {23,23,32},
//            {23,23,32},
//            {23,23,32},
//        };
//        System.out.println(Arrays.deepToString(array));
//    }
//}
//
//////////////////////////////////////
//
//package com.mj.Arrays_8.multidimensionalArray;
//
//import java.util.Arrays;
//
//public class A3_testing{
//    public static void main(String[] args) {
//        int[] arr = {34,43,32};
//        System.out.println(Arrays.toString(arr));
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//        more_change(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void change(int[] arr){
//         arr[1] = 33;
//
//    }
//
//    public static void more_change(int[] arr){
//        arr[2]= 45;
//    }
//}

/////////////////////////
//
//package com.mj.Arrays_8.multidimensionalArray;
//import java.util.Arrays;
//import java.util.Scanner;
//public class A3_testing{
//    public static void main(String[] args) {
//        System.out.println("Changing the integer");
//        int[] nums ={32,23,23};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static void change(int[] nums){
//        nums[1]= 323;
//
//    }
//
//}


//      Multidimensional array
//
//package com.mj.Arrays_8.multidimensionalArray;
//import java.util.Arrays;
//import java.util.Scanner;
//public class A3_testing{
//    public static void main(String[] args) {
//        int[][] arr = new int [3][];
//        Scanner sc = new Scanner(System.in);
////        for (int i = 0; i < arr.length; i++) {
////           arr[i] = arr;
////        }
//        int[][] array = {
//                {2,34,5},
//                {32,34,2},
//                {2,35,6}
//        };
//       System.out.println(Arrays.deepToString(array));
//
//        System.out.println(" k");
//        System.out.println(Arrays.toString(array[1]));
//        System.out.println(array[1][0]);
//        System.out.println(array[1][1]);
//        System.out.println(array[1][2]);
//
//    }
//
//}

//
//package com.mj.Arrays_8.multidimensionalArray;
//import java.util.Arrays;
//import java.util.Scanner;
//public class A3_testing{
//    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int[][] array = new int[3][3];
//
//        for (int row = 0; row < array.length; row++) {
//            // for each column in every row, we want to take an input
//            for (int col = 0; col <  array[row].length; col++) {
//                array[row][col] = sc.nextInt();
//
//
//            }
//        }
//
//
//        for (int row = 0; row < array.length; row++) {
//            // for each column in every row, we want to take an input
//            for (int col = 0; col <  array[row].length; col++) {
//                System.out.print(array[row][col] + " " );
//
//
//            }
//            System.out.println();
//        }
//    }
//}
//


package com.mj.Arrays_8.multidimensionalArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class A3_testing{
    public static void main(String[] args) {
        System.out.println("2D arrays");
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");

        for (int row = 0; row < array.length; row++) {
            {
                for (int col = 0; col < array[row].length; col++) {
                    array[row][col] = sc.nextInt();
                }
            }
        }
        System.out.println("########################");
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col] + "");
//            }
//            System.out.println();
//
//        }

//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }

        // using enhanced for loop


    for(int[] a : array){
        System.out.println(Arrays.toString(a));
    }
    }
}