/**
 * Application that reads two integers typed in by user,
 * then computes their sum
 */

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Input the first integer: ");
        number1 = input.nextInt();

        System.out.print("Input the second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}
