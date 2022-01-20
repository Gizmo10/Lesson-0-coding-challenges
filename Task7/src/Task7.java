public class Task7 {

    public static void main(String [] args){
        double temperature;

        temperature = convertCelsiusToFahrenheit(7);
        System.out.println(temperature);
    }

    public static double convertCelsiusToFahrenheit(double temperature){

        //The formula is : (temperatureInDegreesCelsius * 9/5) + 32
        return((temperature * 9/5.0) + 32);
    }
}
