/**
 * demonstrate double loops on array
 * a loop iterates on array, then
 * a loop printout "*" with same value of array element
 */

public class BarChart {
    public static void main(String[] args){
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade distribution:");

        // for each array element, output a bar of the chart
        for(int counter=0; counter<array.length; counter++){
            System.out.printf("%-3s", counter);
            for (int stars=0; stars<array[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
