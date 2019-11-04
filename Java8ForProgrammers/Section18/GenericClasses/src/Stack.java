/**
 * java.util package has a generic class.
 * We use generic class to re-write our own Stack class
 */
import java.util.ArrayList;

/**
 * No upper bound is set for Stack class, so Object is used.
 */
public class Stack<T>{
    private final ArrayList<T> elements;

    // constructors
    public Stack(int capacity){
        int initCapacity = capacity>0 ? capacity : 10;
        this.elements = new ArrayList<T>(initCapacity);
    }

    public Stack(){
        this(10);
    }

    // push element onto stack
    public void push(T pushValue){
        elements.add(pushValue);
    }

    public T pop(){
        if(elements.isEmpty()){
            throw new EmptyStackException("Stack is empty, fail to pop");
        }

        return elements.remove(elements.size() -1);
    }
}
