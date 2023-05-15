/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 35: Search Insert Position
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 */
import java.util.Arrays;

public class Leetcode35 {

    public static int searchInsertPosition(int[] arr, int target){

        //creates method for finding index

        Arrays.sort(arr);

        int temp = 0;

        for(int x = 1; x < arr.length; x++){

            //for each index in array except for first

            if (target == arr[x]) return x; //if target is found, return index

            //if target is smaller than current number in array, and bigger than previous, save index to temp

            if (target < arr[x] && target > arr[x - 1]) temp = x;

        } 

        if (target < arr[0]){

            //if target is smaller than any number in array, index is 0
            
            temp = 0;
            
        } else if (target > arr[arr.length - 1]) {

            //if target is bigger than any number in array, index is equal to the length of the array
            
            temp = arr.length;
        
        }
        
        return temp;

    }

    public static void main(String[] args){

        String temp = args[0];

        int target = Integer.parseInt(args[1]);

        String[] tempArr = new String[temp.split(", ").length];

        tempArr = temp.split(", ");

        int[] input = new int[tempArr.length];

        for (int i = 0; i < tempArr.length; i++){

            input[i] = Integer.parseInt(tempArr[i]);

        }

        System.out.println(searchInsertPosition(input, target));

    }
    
}
