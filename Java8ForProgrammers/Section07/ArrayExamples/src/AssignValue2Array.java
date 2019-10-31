/**
 * example of assigning elements to array through for-loop
 */

public class AssignValue2Array {
    public static void main(String[] args){
        /**
         * declare a fixed legnth of integers array with default values
         */
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter=0; counter<array.length; counter++){
            array[counter] = counter*2 +2;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        /**
         * iterating over the array
         */
        for (int counter=0; counter<array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
