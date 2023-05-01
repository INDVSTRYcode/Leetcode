/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 1: Two Sum
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

public class Leetcode1 {

    public static int[] twoSum(int[] arr, int target){

        //bruteforce method of solving

        for(int x = 0; x < arr.length - 1; x++){ //for each number in array

            for(int y = x + 1; y < arr.length; y++){ //compare to the rest of array

                if(arr[x] + arr[y] == target && arr[x] != arr[y]){ 
                    
                    //if numbers in comparison add up to our target and aren't duplicates, return them

                    return new int[]{x,y};

                }

            }

        } return null;

    }

    
    public static void main(String args[]){

        String temp;

        String[] tempArr; //instance variables

        int[] input;

        int target;

        Scanner sc = new Scanner(System.in);

        temp = sc.nextLine(); //user array input

        tempArr = new String[temp.split(",").length]; //creates string array with length of user input

        tempArr = temp.split(","); //splits string input into string array

        input = new int[tempArr.length]; //creates int array for string array to be parsed into

        for (int i = 0; i < tempArr.length; i++) {

            input[i] = Integer.parseInt(tempArr[i]); //parses string array into int array

        }

        temp = sc.nextLine();

        target = Integer.parseInt(temp);

        System.out.println(Arrays.toString(twoSum(input, target))); //prints result of method call

        sc.close();

    }
    
}

