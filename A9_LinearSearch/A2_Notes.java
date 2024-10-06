package com.mj.A9_LinearSearch;


  /*
public class A2_Notes {


    Defination of time complexity : As the size of the input is growing,how my time is growing is called time complexity.

     Linear search is just straightforward one by one check.

     time complexity of Linear search-
     best case:found the item at 0th index :O(1)
    worst case: didn't find the item inside the array:O(N)



}
*/

public class A2_Notes {
    public static void main(String[] args) {
        String name = "Mudit";
        char target = 'm';
        System.out.println(search(name, target));

    }

    static boolean search(String str,char target){
        if(str.length() ==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}