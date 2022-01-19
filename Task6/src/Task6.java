public class Task6 {

    public static void main(String [] args){

        double maximum;

        //Testing the function with various arguments
        maximum = getMaximum(1,2,3);
        System.out.println(maximum);

        maximum = getMaximum(-1,0,-3);
        System.out.println(maximum);

        maximum = getMaximum(8,7,-8);
        System.out.println(maximum);

        maximum = getMaximum(2.3,-0.5,2.2);
        System.out.println(maximum);
    }

    public static double getMaximum(double a,double b,double c){

        double maximum;

        if(a > b){

            maximum = a;
        }else{

            maximum = b;

            if(c > maximum){

                maximum = c;
            }
        }

        return maximum;
    }
}
