public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message){
        super(message);
    }

    public EmptyStackException(){
        this("Stack is empty");
    }
}
