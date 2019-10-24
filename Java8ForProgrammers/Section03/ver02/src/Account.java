/**
 * constructor was added to the class
 */

public class Account {
    // instance variable
    private String name;

    //constructor initializes name with parameter name
    public Account(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
