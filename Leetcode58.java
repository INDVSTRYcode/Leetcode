 /**
  * @author Jankee
  * @version 1.0
  * Solution to Leetcode 58
  *
  * Given a string s consisting of words and spaces, return the length of the last word in the string.
  *
  */
  public class Leetcode58{

    public static int lengthOfLastWord(String str){

        str = str.trim();

        //removes uneccesary whitespace

        int b = str.length() - 1;

        while(b >= 0 && str.charAt(b) != ' '){

            //tracks length of last word after space
            
            b--;

        }

        return str.length() - (b + 1);


    }

      public static void main(String args[]){

        System.out.println(lengthOfLastWord(args[0]));

    }
  }
