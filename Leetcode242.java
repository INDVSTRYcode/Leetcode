/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 242: Valid Anagram
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 */
import java.util.Arrays;

public class Leetcode242{

    public static boolean validAnagram(String x, String y){

        //accepts two strings

        if (x.length() != y.length()) {

            return false; //if strings differ in length, break

        }

        char[] arr1 = new char[x.length()];
        arr1 = strToCharArray(x);
        char[] arr2 = new char[y.length()];
        arr2 = strToCharArray(y);

        //turns strings into char arrays and sort them

        for(int z = 0; z < arr1.length - 1; z++){

            //if arrays aren't identical then break

            if (arr1[z] != arr2[z]){

                return false;

            }

        }

        return true; //passed all tests return true

    }

    public static char[] strToCharArray(String str){

        char[] tempArr = new char[str.length()];

        //creates temp arr

        for(int x = 0; x < str.length(); x++){

            tempArr[x] = str.charAt(x); //fills temp arr

        }

        Arrays.sort(tempArr); //sorts arr

        return tempArr;

    }

    public static void main(String[] args){

        System.out.println(validAnagram(args[0], args[1])); //prints results

    }
    
}
