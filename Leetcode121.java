/**
 * @author Jankee
 * version 1.0
 * 
 * Solution to Leetcode Problem 121: Buy and Sell Stocks
 */
public class Leetcode121 {

    public static int buyAndSell(int[] arr){

        int difference = 0;

        for (int y = 0; y < arr.length; y++){

            for (int x = y + 1; x < arr.length; x++){

                if((arr[x] - arr[y]) > difference){

                    //finds biggest difference between future elements

                    difference = arr[x] - arr[y];

                }

            }

        }

        return difference;

    }
    
    public static void main(String[] args){

        String temp = args[0];

        String[] tempArr = new String[(temp.split(", ")).length];

        tempArr = temp.split(", ");

        int[] intArr = new int[tempArr.length];

        for(int x = 0; x < tempArr.length; x++){

            intArr[x] = Integer.parseInt(tempArr[x]);

        } //parse input into int array

        System.out.println(buyAndSell(intArr));

    }

}
