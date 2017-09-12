
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringTester
     */
    public static void main() {
        System.out.println(WeatherConditionals.getHikingAdvice(79,10,12, "clOudy"));
        System.out.println(WeatherConditionals.getHikingAdvice(79,10,2, "Fair"));
        System.out.println(WeatherConditionals.getHikingAdvice(55, 10, 0, "foggy"));
        System.out.println(WeatherConditionals.getHikingAdvice(88, 0, 1, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(32,10,2, "SNOWING"));
        System.out.println(WeatherConditionals.getHikingAdvice(32,0,2, "SNOWING"));
        String d = "HEllO";
        System.out.println(d.toLowerCase());
    }
}
