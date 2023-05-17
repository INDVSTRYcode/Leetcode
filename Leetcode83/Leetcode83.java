/**
 * @author Jankee
 * @version 1.0
 * 
 * Solution to LeetCode Problem 83: Remove Duplicates from Sorted List
 * 
 * method for removing duplicate integers from a sorted list
 * 
 */
public class Leetcode83{

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){

        for(int x = 0; x < list.getSize() - 1; x++){

            //for every node in list, compare adjacent nodes data

            if (list.locatePosition(x) == list.locatePosition(x + 1)) {

                //if data is duplicate remove left node

                list.removeMiddle(list.locatePosition(x));

            }

        }

        return list;

    }

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int x = 0; x < args[0].length(); x++){

            if(args[0].charAt(x) != ',' && args[0].charAt(x) != ' '){

                //turns string into linkedList
                
                list.addToEnd(Integer.parseInt(Character.toString(args[0].charAt(x))));
            
            }

        }

        list.sort();

        removeDuplicates(list);

        System.out.println(list.toString());

    }
    
}
