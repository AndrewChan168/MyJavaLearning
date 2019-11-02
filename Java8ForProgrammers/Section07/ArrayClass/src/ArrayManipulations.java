/**
 * use static methods of Array Class
 */

import java.util.Arrays;

public class ArrayManipulations {
    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s: ", description);
        for (int value : array){
            System.out.printf("%d ", value);
        }
        System.out.println();
    }

    public static void main(String[] args){
        // sort doubleArray into ascending order
        System.out.println("Example of Arrays.sort()");
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");
        for(double value:doubleArray){
            System.out.printf("%.1f ", value);
        }

        // fill 10-element array with 7s
        System.out.println("Example of Arrays.fill()");
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "Arrays.fill()");

        // copy array intArray into array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArray, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        System.out.println("Example of Arrays.equal()");
        boolean b;
        b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", b?"==":"!=");
        int[] newArray = { 1, 2, 3, 4, 5, 6 };
        b = Arrays.equals(intArray, newArray);
        System.out.printf("%n%nintArray %s newArray%n", b?"==":"!=");
        /**
         * Arrays.equal(array1, array2) compares contents of the two array
         * array1.equals(array2) compares whether array1 and array2 refer to the same array object
         */

        // search intArray for the value 5
        /**
         * If value is found, binarySearch returns the index of the element,
         * binarySearch returns a negative value.
         *
         * The negative value returned is based on the search key’s insertion point,
         * the index where the key would be inserted in the array if we were performing an insert operation.
         */
        System.out.println("Examples of Arrays.binarySearch()");
        int location;
        System.out.println("Search for 5");
        location = Arrays.binarySearch(intArray, 5);
        System.out.printf("Location is found in %s%n", location);
        if (location >= 0){
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }
        System.out.println("Search for 8765");
        location = Arrays.binarySearch(intArray, 8765);
        System.out.printf("Location is found in %s%n", location);
        if (location >= 0){
            System.out.printf("Found 8765 at element %d in intArray%n", location);
        } else {
            System.out.println("8765 not found in intArray");
        }
    }
}
