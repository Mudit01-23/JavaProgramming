package com.mj.A9_LinearSearch;
import java.util.Scanner;
import java.util.Arrays;
// linear search on string



//public class A7_Questions {
//    public static void main(String[] args) {
//        String name = "Mudit";
//        char target  = 'M';
//        System.out.println( linearSearch(name,target));
//
//
//    }
//    static boolean linearSearch(String name,char target){
//        if(name.length()==0){
//            return false;
//        }
//        for (int i = 0; i < name.length(); i++) {
//            if(target == name.charAt(i)){
//                return true;
//            }
//
//        }
//        return false;
//    }
//}


// one more method

//public class A7_Questions {
//    public static void main(String[] args) {
//        String name = "Mudit";
//        char target = 'n';
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(linearSearch1(name, target));
//
//
//    }
//
//    static boolean linearSearch1(String name, char target) {
//        if (name.length() == 0) {
//            return false;
//        }
//        for (char ch : name.toCharArray()) {
//            if (ch == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}


// Q- Search for 3 in range in range[1,4]
//          {23 ,4, 234,    53, 34, 3,  23, 53}
//          {  0,  1,   2,          3,   4,   5,  6,     7}

//
//public class A7_Questions {
//    public static void main(String[] args) {
//        int[] array= {18,12,-7,3,14,28};
//        Scanner sc = new Scanner(System.in);
//        System.out.println(Arrays.toString(array));
//        System.out.println("Enter the target ");
//        int target = sc.nextInt();
//        System.out.println("Enter the starting range");
//
//        int start = sc.nextInt();
//        System.out.println("Enter the end range");
//        int end = sc.nextInt();
//
//
//        if(end>=array.length || start<0 || start > end){
//            System.out.println("Index out of bound"+ " the size of array is "+"{"+start+","+ (array.length-1)+ "}"+ " and you've entered the range"+"{"+ start+","+ end+"}");
//            return;
//        }
//
//        else{
//            checking(array,target,start,end);
//        }
//
//    }
//
//    static void checking(int[] array,int target,int start,int end){
//
//        for (int i = start; i <=end ; i++) {
//            if(array[i]== target){
//                System.out.println(target+ " is present in index position: " + i+ " in range [ "+ start + ","+ end+ "]");
//                return;
//            }
//        }
//        System.out.println(target+ " is not present " + "in range [ "+ start + ","+ end+ "]");
//        return;
//    }
//}


// Find maximum and minimum number inside a range


public class A7_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] array= {2,343,34,-2,3,0,23};
        int[] array = {1000, 1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        System.out.println("Enter start range");
        int start = sc.nextInt();
        System.out.println("Enter end range");
        int end = sc.nextInt();
        if(start<0|| start>=end || end>= array.length){
            System.out.println("Index out of bound");
        }
        else{
            linearSearch(array,start,end);
        }

    }
    static void linearSearch(int[] array,int start, int end){
        int maxNo = array[start];
        int minNo = array[start];

        for (int i = start; i <=end ; i++) {
            if(array[i]>maxNo){
                maxNo = array[i];
            }
            if(array[i]<minNo){
                minNo = array[i];
            }
        }

        System.out.println("the maximum and minimum number in range"+" {"+ start+","+end+ "}" +" are: "+ maxNo+ " and " + minNo+ " respectively");

    }
}