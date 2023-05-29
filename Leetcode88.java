/**
 * 
 * @author Jankee
 * @version 1
 * 
 * Solution to Leetcode 88, Merge Sorted Arrays 
 */
import java.util.Arrays;
public class Leetcode88 {

    private static int[] arr1;

    private static int[] arr2;

    private static String[] tempArr;

    private static int[] result;

    public static int[] toIntArr(String temp, int size){

        tempArr = new String[size];

        result = new int[size];

        tempArr = temp.split(", ");

        for (int x = 0; x < size; x++){

            result[x] = Integer.parseInt(tempArr[x]);

        }

        return result;

    }

    public static void mergeArray(int size1, int size2){

        int y = 0;

        for(int x = ((size1 - size2)); x < size1; x++){

            arr1[x] = arr2[y];

            y++;

        }

        Arrays.sort(arr1);

    }

    public static void main(String[] args){

        int size1, size2;

        size1 = Integer.parseInt(args[1]);

        size2 = Integer.parseInt(args[3]);

        arr1 = new int[size1 + size2];

        arr2 = new int[size2];

        arr1 = toIntArr(args[0], size1 + size2);

        arr2 = toIntArr(args[2], size2);

        mergeArray(size1 + size2, size2);

        System.out.println(Arrays.toString(arr1));

    }
    
}
