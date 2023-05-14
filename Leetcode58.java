 /**
  * @author Jankee
  * @version 1.0
  * Solution to Leetcode 58
  *
  * Given a string s consisting of words and spaces, return the length of the last word in the string.
  *
  */
  public class Leetcode58{

    public static String lengthOfLastWord(String str){

        str = str.trim();

        int b = str.length() - 1;

        while(str.charAt(b) != " "){

            b--;

        }

        return str.length() - b;


    }

      public static void main(String args[]){

        Ststem.out.println(lengthOfLastWord(args[0]));

    }
  }
