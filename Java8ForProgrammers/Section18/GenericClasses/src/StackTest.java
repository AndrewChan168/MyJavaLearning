public class StackTest {
    public static <T> void testPush(String name, Stack<T> stack, T[] elements){
        System.out.printf("%nPushing elements onto %s%n", name);
        // push elements onto Stack
        for(T element:elements){
            System.out.printf("%s ", element);
            stack.push(element);
        }
        System.out.println();
    }

    public static <T> void testPop(String name, Stack<T> stack){
        System.out.printf("%nPopping elements from %s%n", name);
        T popValue;

        try{
            while(true){
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch(EmptyStackException emptyStackException){
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args){
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack =  new Stack<>();

        // testing push method of my stack
        testPush("doubleStack", doubleStack, doubleElements);
        testPush("integerStack", integerStack, integerElements);

        // push elements of integerElements onto integerStack
        testPop("doubleStack", doubleStack);
        testPop("integerStack", integerStack);
    }
}
