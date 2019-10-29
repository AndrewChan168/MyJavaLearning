/**
 * Application that make use of Book Class.
 * We will iterate through a range of enum constants.
 */
import java.util.EnumSet;
public class EnumTest {
    public static void main(String[] args){
        System.out.println("All books");

        /**
         * for every enum, the compiler generates the static method values that
         * returns an array of enum's constants in the order they were declared
         */
        // print all books in enum Book
        for(Book book: Book.values())
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());

        System.out.printf("%nDisplay a range of enum constants:%n");

        /**
         * we used static method range() of class EnumSet to display a range of the enum Book’s constants.
         * range() takes two parameters—the first and the last enum constants in the range, and
         * returns an EnumSet that contains all the constants between these two constants, inclusive.
         */
        // print first four books
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
    }
}
