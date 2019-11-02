/**
 * Example that demonstrates Java collections data structure.
 * Java Collections store groups of related objects in memory.
 *
 * The collection class ArrayList<T> dynamically change its size to accommodate
 * more elements. T is a placeholder which is the type that we want the ArrayList
 * to hold
 */
import java.util.ArrayList;

public class ArrayListCollection {
    // display the ArrayList's elements on the console
    public static void displayArray(ArrayList<String> items, String header){
        System.out.printf(header); // display header

        for(String item:items){
            System.out.printf(" %s%n", item);
        }
        System.out.println();
    }

    public static void main(String[] args){
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        //append an item
        items.add("Yellow");
        // insert "Green" at index 0
        items.add(0 , "Green");
        displayArray(items, "Display list%n");

        System.out.println();

        //append two items to end of ArrayList
        items.add("Red");
        items.add("Yellow");
        displayArray(items, "After append two elements%n");

        // remove first "yellow"
        items.remove("Yellow");
        displayArray(items, "After remove the first yellow%n");

        // remove item with index = 1
        items.remove(1);
        displayArray(items, "After remove item with index = 1%n");

    }
}
