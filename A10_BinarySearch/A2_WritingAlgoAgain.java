import java.util.Scanner;
import java.util.Arrays;

public class A2_WritingAlgoAgain{
    public static void main(String[] args){
         int[] array = {-5,-4,-3,-2,-1,0};
//        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(binarySearch(array,target));
    }

    static int binarySearch(int[] array,int target){

        int start = 0;
        int end = array.length-1;



        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>array[mid]){
                start = mid+1;

            }
            else if(target<array[mid] ){
                end = mid-1;
            }
            else{
                return mid;
            }

        }

    return -1;
    }
}

