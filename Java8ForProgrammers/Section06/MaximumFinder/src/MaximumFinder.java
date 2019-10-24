/**
 * Class method maximum with three double parameters
 * */
public class MaximumFinder{
    // class method with static keyword
    public static double maximum(double x, double y, double z){

        /** // reuse Math.max
        // local variable
        double maximumValue = x;

        if(y>maximumValue)
            maximumValue = y;

        if(z>maximumValue)
            maximumValue = z;

        return maximumValue;
         */
        return Math.max(x, Math.max(y, z));
    }
}