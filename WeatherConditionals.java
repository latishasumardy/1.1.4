
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
       if (temperature >= 65 && (description.toLowerCase().equals("cloudy"))) {
           return "You're in San Jose.";
        }
       else if (description.toLowerCase().equals("fair")) {
           return "You're in Santa Fe.";
        }
       else if ((description.toLowerCase().equals("foggy")) && temperature <= 63) {
           return "You're in San Francisco.";
        }
       else if (humidity <= 2 && (description.toLowerCase().equals("sunny"))) {
           return "You're in San Ramon.";
        }
       else if ((description.toLowerCase().equals("snowing")) && windchill >= 5) {
           return "You're in Lake Tahoe.";
        }
       else {
           return "Bring an Umbrella!";
        }

    }
}
