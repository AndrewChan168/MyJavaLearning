public class DrangingElse {
    public static void drangingElse(int x, int y){
        if (x>5)
            if (y>5)
                System.out.println("X and Y are > 5");
        else
            System.out.println("X is <= 5");
    }

    public static void nestedElse(int x, int y){
        if (x>5){
            if (y>5)
                System.out.println("X and Y are > 5");
        } else {
            System.out.println("X is <= 5");
        }
    }
}
