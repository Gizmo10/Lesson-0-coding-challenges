/*Because the range of the input was not specified, I assumed the numbers are
=> 0
 */
public class Task6 {

    public static void main(String [] args){

        double maximum;

        //Testing the function with various arguments
        maximum = getMaximum(1,2,3);
        System.out.println(maximum);

        maximum = getMaximum(1,0,3,3,5,7,4,2);
        System.out.println(maximum);

        maximum = getMaximum(8,7);
        System.out.println(maximum);

        maximum = getMaximum( );
        System.out.println(maximum);
    }

    public static double getMaximum(double... args){
        /*Maximum is initialised to zero to allow us to have a return value of zero
        when there are no arguments passed. This is based on the assumption that
        values passed are => 0
         */
        double maximum = 0;
        int count = 0;

        if(args.length == 0){

            return maximum;
        }else{

            for(double number: args){
                //The first element assigned to maximum
                if(count == 0){

                    maximum = number;
                    count++;
                }else{

                    if(number > maximum){

                        maximum = number;
                    }
                }
            }
        }

        return maximum;
    }

}
