/**
 * example of accumulating elements in array
 */

public class AccumulateArray {
    public static void main(String[] args){
        int[] array = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99};
        int total = 0;

        for (int counter=0; counter<array.length; counter++){
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
