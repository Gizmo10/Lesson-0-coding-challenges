public class Task5 {

    public static void main(String [] args){

        /* Testing the function with various arguments*/
        areaOfATriangle(1,2,3);
        areaOfATriangle(2.3,3,4);
        areaOfATriangle(0,1,2);
        areaOfATriangle(-1,3,9);
    }

    public static double areaOfATriangle(double side1,double side2,double side3){

        //If any of the parameters is negative
        if(side1 < 0 || side2 < 0 || side3 < 0){

            return 0;
        }

        return ((side1 + side2 + side3)/ 2.0);
    }
}
