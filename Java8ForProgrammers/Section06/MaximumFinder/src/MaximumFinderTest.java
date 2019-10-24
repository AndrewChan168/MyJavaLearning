import java.util.Scanner;

public class MaximumFinderTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt for and input three floating-point values
        System.out.println("Enter three floating-point values separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = MaximumFinder.maximum(number1, number2, number3);

        System.out.printf("Maximum number is: "+result);
    }
}
