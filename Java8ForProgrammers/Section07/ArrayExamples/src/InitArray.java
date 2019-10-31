public class InitArray {
    public static void main(String[] args){
        /**
         * create a static array with Integer type and length is 10.
         * As no value was assigned to array elements, the element is in default value
         */
        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");

        /**
         * iterating over the array
         */
        for (int counter=0; counter<array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
