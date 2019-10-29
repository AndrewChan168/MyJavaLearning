/**
 * Class that demonstrate class variable.
 * Static variables have class scope - they are class variables
 */

public class Employee {
    // class variable that could be accessed by all instances of Employee class
    private static int count = 0;
    private String firstName;
    private String lastName;

    //constructor
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        /**
         * each time instance of class Employee is created, class variable count would be added 1
         */
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",firstName, lastName, count);
    }

    /**
     * method that access to class field - count
     * must be with static keyword.
     * Cannot use this keyword in static method
     */
    public static int getCount(){
        return count;
    }

    // instance methode

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
