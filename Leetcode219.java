/**
* @name djankee
* @version 1.00
* Given an integer array nums and an integer k
* return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/
public class Leetcode219 {

    public static boolean containsDuplicate(int[] arr, int target){

        //for each number in array

        for(int x = 0; x < arr.length - 1; x++){

            //start looping through targeted range

            for(int y = x - (target); y < x + (target); y++){

                //if indices are distinct, valid, and return the same value, return true

                if (x != y && y >= 0 && y < arr.length && arr[x] == arr[y]) {

                    return true;

                }

            }

        }

        return false;
        
    }

    public static void main(String[] args){

        String temp = args[0];

        String[] tempArr = new String[(temp.split(", ")).length];

        tempArr = temp.split(", ");

        int[] intArr = new int[tempArr.length];

        for(int x = 0; x < tempArr.length; x++){

            intArr[x] = Integer.parseInt(tempArr[x]);

        }

        System.out.println(containsDuplicate(intArr, Integer.parseInt(args[1])));

    }

}