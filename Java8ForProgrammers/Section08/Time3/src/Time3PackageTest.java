import andrew.javafp.ch08.Time3;

public class Time3PackageTest {
    private static void displayTime(String header, Time3 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }

    public static void main(String[] args){
        // create and initialize a Time1 object
        Time3 time = new Time3(); // invokes Time1 constructor

        // output string representations of the time
        displayTime("After time object is created", time);
        System.out.println();

        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();
    }
}
