/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to LeetCode problem 14: Longest Common prefix
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode14{

    public String longestCommonPrefix(String[] strs) {

        //method for finding longest common prefix amongst (all) strings in an array

        //since every string needs to be common, after sorting the array the first and last are all that need to be compared.

        String str0 = "";

        String str1 = ""; //instance variables

        int iterator = 0;

        if (strs.length == 0) return str0; //if array is empty return empty string

        Arrays.sort(strs); //sort array

        str0 = strs[0]; //sets string zero to the first string in alphbetical order

        str1 = strs[strs.length - 1]; //sets string one to the last string in alphbetical order

        while(iterator < str0.length() && iterator < str1.length()){

            //while the iterator is smaller than both lengths of each string, continue

            if(str0.charAt(iterator) == str1.charAt(iterator)) {
                
                iterator++; //if characters are equal at given index, proceed to next index
            
                } else {

                    break; // once charachters are unequal, break

                    }

        }

        return str0.substring(0, iterator); //return a substring of string zero ending at the index of the iteration result

        }
    

    public static void main(String args[]){

        String temp = "";

        Scanner sc = new Scanner(System.in);

        Leetcode14 leetcode14 = new Leetcode14();
        
        temp = sc.nextLine();
        
        System.out.println(leetcode14.longestCommonPrefix(temp.split(", ")));

        sc.close();

    }

}