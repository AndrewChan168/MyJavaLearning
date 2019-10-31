/**
 * class summarize the elements in array
 * and also demonstrate how to handle ArrayIndexOutOfBoundsException
 */
public class SummarizeArray {
    public static void main(String[] args){
        // student response array with last one is larger than array length
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        // array for summarizing responses
        int[] frequencies = new int[6];

        for (int counter=0; counter<responses.length; counter++){
            try{
                ++frequencies[responses[counter]];
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n", counter, responses[counter]);
            }
        }

        // printout the summarised result
        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // output each array element's value
        /**
         * as counter variable starts with 1, the condition is changed to <=
         */
        for(int rating = 1;rating<=frequencies.length;rating++){
            System.out.printf("%6d%10d%n", rating, frequencies[rating]);
        }
    }
}
