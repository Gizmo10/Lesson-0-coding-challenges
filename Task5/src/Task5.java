public class Task5 {

    public static void main(String [] args){

        double area;
        /* Testing the function with various arguments*/
        area = computeAreaOfATriangle(1,2,3);
        System.out.println(area);

        area = computeAreaOfATriangle(2.3,3,4);
        System.out.println(area);

        area = computeAreaOfATriangle(0,1,2);
        System.out.println(area);

        area = computeAreaOfATriangle(-1,3,9);
        System.out.println(area);
    }

    public static double computeAreaOfATriangle(double side1,double side2,double side3){

        //If any of the parameters is negative
        if(side1 < 0 || side2 < 0 || side3 < 0){

            return 0;
        }

        return ((side1 + side2 + side3)/ 2.0);
    }
}
