/**
 * The average should be decimal number.
 * As integer division return integer, we need to tell program to decimal division on two integers
 */

import java.util.Scanner;

public class ClassAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // initializing
        int total = 0;
        int gradeCounter = 1;
        int grade;

        // -1 for escaping key
        // first asking user
        System.out.print("Enter grade or -1 to quit");
        grade = input.nextInt();

        // looping for input
        while (grade!=-1){
            System.out.println("Counting: "+gradeCounter);

            total+=grade;
            gradeCounter+=1;

            System.out.print("Enter grade or -1 to quit");
            grade = input.nextInt();
        }

        // terminate phase
        if (gradeCounter>0){
            // if user input at least 1 grade

            /**
             * (double) is the unary cast operator.
             * in this case, Java create a temporary floating-point copy of variable total.
             * It is also explicit conversion.
             */

            /**
             * type double is preferered over float type because double variables represent decimal more accurately
             */
            double average = (double) total/gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }

        int average = total/10;

        System.out.printf("%n Total of all 10 grade is :%d%n", total);
        System.out.printf("Average is :%d%n", average);
    }
}