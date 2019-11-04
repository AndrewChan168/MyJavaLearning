
import java.util.ArrayList;
import java.util.Arrays;
public class WildCardsTest {
    /*
    public static double sum(ArrayList<Number> list){
        double total = 0;

        // calculate sum
        for (Number element:list){
            total += element.doubleValue();
        }
        return total;
    }
    */
    public static <T extends Number> double sum(ArrayList<T> list){
        double total = 0;
        // calculate sum
        for (Number element:list){
            total += element.doubleValue();
        }
        return total;
    }

    public static void main(String[] args){
        /*
        Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element:numbers){
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
        */
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in integerList: %.0f%n%n", sum(integerList));

        Double[] doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubles));
        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.0f%n%n", sum(doubleList));

        Number[] numbers = {1, 2.4, 3, 4.1};
        ArrayList<Number> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.0f%n%n", sum(numberList));
    }
}
