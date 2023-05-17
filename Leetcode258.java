/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 258: Add Digits
 * 
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
 */
public class Leetcode258 {

    public static int addDigits(String num){

        int result = 0;

        if (num.length() == 1) {

            //if number only has one digit, return it
            
            return Integer.parseInt(num);
        
        } else {

            for(int x = 0; x < num.length(); x++){

                //for character in string, convert from string into int and add it to result

                result += Integer.parseInt(Character.toString(num.charAt(x)));

            } 

            return result;

        }

    }

    public static void main(String[] args){

        System.out.println(addDigits(args[0]));

    }
    
}
