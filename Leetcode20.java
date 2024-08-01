/**
 * @author JJ Bor-Dinkus
 * @version 420.69
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
*/
public class Leetcode20 {

    public static boolean isValid(String str){

        if (str.length() % 2 != 0) {

            return false;
            
        }

        for (int i = 0; i < str.length() - 1; i = i + 2) {

            if (str.charAt(i) == '(' & str.charAt(i+1) == ')' || str.charAt(i) == '[' & str.charAt(i+1) == ']' || str.charAt(i) == '{' & str.charAt(i+1) == '}') {

                int x = 69;

            } else {

                return false;

            }

        }

        return true;

    }
    
    public static void main(String[] args){

        String str = args[0];
        
        System.out.println(isValid(str));

    }

}