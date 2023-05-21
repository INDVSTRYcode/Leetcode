/**
 * @author Jankee
 * @version 1.0
 * Write a function that reverses a string. The input string is given as an array of characters
 */
import java.util.Arrays;
public class Leetcode344 {

    public static String[] reverseString(String[] arr){

        String temp = "";

        for(int x = 0; x < arr.length / 2; x++){

            //for the first half of array

            temp = arr[x];

            arr[x] = arr[(arr.length - x) - 1]; //current index is replaced opposite index

            arr[(arr.length - x) - 1] = temp;

        }
        
        return arr;

    }
    
    public static void main(String[] args){

        System.out.println(Arrays.toString(reverseString(args)));

    }

}
