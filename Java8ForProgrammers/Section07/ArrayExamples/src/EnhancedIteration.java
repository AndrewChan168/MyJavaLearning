/**
 * Using the enhanced for-loop iterating array
 */

public class EnhancedIteration{
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // add each element's value to total
        // using enhanced array iteration
        for(Int num:array){
            total += num;
        }
        System.out.printf("Total of array elements: %d%n", total);
    }
}