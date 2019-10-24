/**
 * Object is Pass-by-reference
 */

public class AccountTest {
    // method with static keyword could be called without first creat an object of the class
    public static void main(String[] args){
        Account account1 = new Account("Jane Green");
        Account account2 =  account1;

        System.out.println("Before changing");
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

        System.out.println("After changing");
        account1.setName("John Blue");
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
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