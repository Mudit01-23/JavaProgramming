package com.mj.A10_BinarySearch;
import java.util.*;

// simple binary search (order agnostic)


//
//public class A14_Practicing_all_questions {
//    public static void main(String[] args) {
//        //int[] array = {2,5,7,9,12,16,19,20};
//        int[] array = {20,19,16,12,9,7,5,2};
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        int answer = ceiling(array,target);
//        System.out.println("The position of " + target + " is: "+ answer);
//    }
//public static int ceiling(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        boolean isAscending = array[0]<array[array.length-1];
//        while(start<=end){
//            int mid = start+ (end-start)/2;
//            if(array[mid]==target){
//                return mid;
//            }
//            else if(array[mid]<target){
//                if(isAscending){
//                    start = mid+1;
//                }
//                else{
//                    end = mid-1;
//                }
//            }
//            else{
//                if(isAscending){
//                    end = mid-1;
//
//                }
//                else{
//                    start = mid+1;
//                }
//            }
//        }
//        return -1;
//}
//}



// Q- Order agnostic ceiling and floor operation


//public class A14_Practicing_all_questions {
//
//        public static void main(String[] args) {
//            int[] array = {2,5,7,9,12,16,19,20};
//            // int[] array = {20,19,16,12,9,7,5,2};
//        System.out.println(Arrays.toString(array));
//            System.out.print("Enter target: ");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        int ceiling = ceiling(array,target);
//        int floor   = floor(array,target);
//        System.out.println("The floor and ceiling  of " + target + " is: "+ "{" + floor+","+ ceiling+ "}");
//    }
//
//
//public static int ceiling(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        boolean isAscending = array[0]<array[array.length-1];
//        if(target> array[array.length-1]){
//            return -1;
//        }
//        while(start<=end){
//            int mid = start+ (end-start)/2;
//            if(array[mid]==target){
//                return array[mid];
//            }
//
//            else if(array[mid]<target){
//                   if(isAscending){
//                       start = mid+1;
//                   }
//                   else{
//                       end = mid-1;
//                   }
//                }
//
//            else{
//                if(isAscending){
//                    end = mid-1;
//
//                }
//                else{
//                    start = mid+1;
//                }
//                }
//
//        }
//       if(isAscending){
//           return array[start];
//       }
//       else{
//           return array[end];
//       }
//}
//
//
//    public static int floor(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        if(target< array[0]){
//            return -1;
//        }
//        boolean isAscending = array[0]<array[array.length-1];
//        while(start<=end){
//            int mid = start+ (end-start)/2;
//
//            if(array[mid]==target){
//                return array[mid];
//            }
//
//            else if(array[mid]<target){
//                if(isAscending){
//                    start = mid+1;
//                }
//
//                else{
//                    end = mid-1;
//                }
//            }
//
//            else{
//
//                if(isAscending){
//                    end = mid-1;
//
//                }
//
//                else{
//                    start = mid+1;
//                }
//            }
//
//        }
//        return array[end];
//    }
//
//}





public class A14_Practicing_all_questions {
    public static void main(String[] args) {
        int[] array = {10,15,20,25,30,35,40};
        //int[] array = {40,35,30,25,20,15,10};
        System.out.println(Arrays.toString(array));
        System.out.print("Enter target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] answer = FloorAndCeiling(array,target);
        System.out.println("The floor and ceiling of "+ target+ " is " +Arrays.toString(answer));
    }

    public static int[] FloorAndCeiling(int[] array, int target){

        if(target<array[0] || target>array[array.length-1]){
            return new int[]{-1,-1};
        }
        else{
            int floor = floor( array,target);
            int ceiling = ceiling(array,target);
            return new int[]{floor,ceiling};
        }

       // return new int[]{-1,-1};
    }

    public static int floor(int[] array,int target){
      int start = 0;
      int end = array.length-1;
      boolean isAscending = array[0]<array[array.length-1];

      while(start<=end){
          int mid = start + (end-start)/2;
          if(array[mid]==target){

                 return array[mid];
          }
          else if(array[mid]<target){
              if(isAscending){
                  start = mid+1;
              }
              else{
                 end = mid-1;
              }
          }

          else {
                  if(isAscending){
                      end = mid-1;
                  }
                  else{
                      start = mid+1;

                  }
              }


      }


       if(isAscending){
           return array[start];
       }
       else{
           return array[end];
       }
    }

    public static int ceiling(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        boolean isAscending = array[0]<array[array.length-1];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]==target){

                return array[mid];
            }
            else if(array[mid]<target){
                if(isAscending){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

            else {
                if(isAscending){
                    end = mid-1;
                }
                else{
                    start = mid+1;

                }
            }


        }


        if(isAscending){
            return array[end];
        }
        else{
            return array[start];
        }
    }

}

