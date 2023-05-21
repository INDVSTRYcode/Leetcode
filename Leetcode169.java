/**
 * @author Djanky
 * @version 1
 * given an array nums of size n, return the majority element
 */
import java.util.Arrays;

public class Leetcode169 {

    public static int majorityElement(int[] arr){

        Arrays.sort(arr); // once array is sorted, we only need to check each half of array 

        for(int x = 0; x < arr.length / 2; x++){

            if(arr[x] == arr[(arr.length / 2) + x]){ 

                //if number at given array index is the same as the number halfway across the array

                return arr[x];

            }

        }

        return arr[arr.length / 2];

    }
    
    public static void main(String[] args){

        int[] arr = new int[args.length];

        for(int y = 0; y < args.length; y++){

            arr[y] = Integer.parseInt(args[y]);

        }

        System.out.println(majorityElement(arr));

    }

}
