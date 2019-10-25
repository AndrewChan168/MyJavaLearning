import java.util.Scanner;

public class ClassAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // initializing
        int total = 0;
        int gradeCounter = 1;

        // looping for user input
        while (gradeCounter<10){
            System.out.println("Counting: "+gradeCounter);
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter += 1;
        }

        // terminate phase
        /**
         * both total & 10 are integers.
         * It is triggering integer division,
         * any fractional part of division is truncated
         */
        int average = total/10;

        System.out.printf("%n Total of all 10 grade is :%d%n", total);
        System.out.printf("Average is :%d%n", average);
    }
}