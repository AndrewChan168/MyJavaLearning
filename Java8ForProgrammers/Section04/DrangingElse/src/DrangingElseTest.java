public class DrangingElseTest {

    public static void main(String[] args){
        int x;
        int y;

        // case-1
        x = 5;
        y = 0;
        System.out.println("Case of X: %s, Y: %s"+ x + y);
        System.out.println("Dranging Else:");
        DrangingElse.drangingElse(x, y);
        System.out.println("Nested Else:");
        DrangingElse.nestedElse(x, y);

        // case-2
        x = 5;
        y = 5;
        System.out.println("Case of X: %s, Y: %s"+ x + y);
        System.out.println("Dranging Else:");
        DrangingElse.drangingElse(x, y);
        System.out.println("Nested Else:");
        DrangingElse.nestedElse(x, y);

        // case-3
        x = 0;
        y = 0;
        System.out.println("Case of X: %s, Y: %s"+ x + y);
        System.out.println("Dranging Else:");
        DrangingElse.drangingElse(x, y);
        System.out.println("Nested Else:");
        DrangingElse.nestedElse(x, y);
    }
}
