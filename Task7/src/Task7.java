public class Task7 {

    public static void main(String [] args){
        double temperature;

        temperature = convertCelsiusToFahrenheit(28);
        System.out.println(temperature);

        temperature = convertFahrenheitToCelsius(temperature);
        System.out.println(temperature);
    }

    public static double convertCelsiusToFahrenheit(double temperature){

        //The formula is : (temperatureInDegreesCelsius * 9/5) + 32
        return((temperature * 9/5.0) + 32);
    }

    public static double convertFahrenheitToCelsius(double temperature){

        //The formula above was used to derive this
        return((5*temperature - 160)/9.0);
    }
}
