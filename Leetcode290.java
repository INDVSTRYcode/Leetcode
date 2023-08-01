/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to Leetcode 290: Word Pattern
 * 
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 */
import java.util.HashMap; 
import java.util.Arrays;
public class Leetcode290 {

    public static boolean wordPattern(String x, String y){

        //solution using hashmap and key value pairs

        HashMap<Character, String> patternMap = new HashMap<Character, String>(); //creates hashmap

        String[] tempArr = new String[y.split(" ").length]; //creates array for string values to be stored in
        
        tempArr = y.split(" "); //splits values into array

        if(x.length() != tempArr.length) return false; //if keys and values differ in length then must be false

        for (int i = 0; i < x.length(); i++){

            //for each charachter in the key string

            char character = x.charAt(i);

            if (patternMap.containsKey(character)) {

                if (!tempArr[i].equals(patternMap.get(character))) {

                    //if character key in already in the map

                    //if the value doesn't match return false

                    return false;

                }

            } else {

                if (patternMap.containsValue(tempArr[i])) {

                    //if key is recognized, check if value already exists

                        return false;

                } else {

                    //if key nor value is found, add pair to hashmap

                     patternMap.put(character, tempArr[i]);

                }

            } 

        }

        //if all keys match their values return true

        return true;

    }

    public static void main(String[] args){

        System.out.println(wordPattern(args[0], args[1]));

    }
    
}
