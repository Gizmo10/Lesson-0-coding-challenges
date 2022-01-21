public class Task2 {

    public static void main(String [] args){

        double x = 1 + 1 * 2;
        double y = (1 + 1) * 2;
        double z = 1 + (1 * 2);
        double a = 1 + 1 * 2 / 2;
        double b = (1 + 1 * 2) / 2.0;

        double [] arrayOfIntegers = {x,y,z,a,b};

        for(double i:arrayOfIntegers){

            System.out.println(i);
        }
    }
}
