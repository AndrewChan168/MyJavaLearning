import java.util.Scanner;



public class AccountTest {
    // method with static keyword could be called without first creat an object of the class
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // new keyword is class instance creation expression
        // a new object of the specified class would be created by new keyword
        Account myAccount = new Account();

        // output null because instance variable name of Account is not yet set before calling  Account.setName()
        // in this case, default initial value would be assigned to the instance variable
        // the default value for an instance value of String type would be null
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter your name: ");
        String theName = input.nextLine();

        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
/**
 * Compiling & Executing Application with Multiple Classes
 * >javac Account.java AccountTest.java
 *
 * or
 * >javac *.java
 *
 * run the class with main()
 * java AccountTest
 * */