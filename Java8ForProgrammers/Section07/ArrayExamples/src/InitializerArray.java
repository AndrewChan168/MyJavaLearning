/**
 * demonstrate initialize array with array initializer
 */

public class InitializerArray {
    public static void main(String[] args){
    /**
     * create a ten-elements array with index value 0-9
     */
    int[] array = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99};

    System.out.printf("%s%8s%n", "Index", "Value");

    /**
     * iterating over the array
     */
    for (int counter=0; counter<array.length; counter++){
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
}

