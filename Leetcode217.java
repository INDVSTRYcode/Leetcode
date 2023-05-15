/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 217: Contains Duplicate
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 */
import java.util.Arrays;

public class Leetcode217 {

    public static boolean containsDupliate(int[] arr){

        //creates method for detecting a duplicate in a given array

       Arrays.sort(arr); //sorts array to makes duplicates easier to find

       for(int x = 0; x < arr.length - 1; x++){

        //iterate through sorted array

            if(arr[x] == arr[x + 1]) return true; //if number directly in front of the current value in the array is equal to the current value, return true

       } return false; //if no duplicates were found return false

    }

    public static void main(String args[]){

        int[] input;

        input = new int[args.length]; //creates int array for string array to be parsed into

        for (int i = 0; i < args.length; i++) {

            input[i] = Integer.parseInt(args[i]); //parses string array into int array

        }

        System.out.println(containsDupliate(input)); //prints result of method call

    }
    
}
