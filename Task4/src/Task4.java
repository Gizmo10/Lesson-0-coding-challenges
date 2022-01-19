public class Task4 {

    public static void main(String [] args){

        //An array with test integers to drive and test the function
        int [] arr = {1,3,6,0,109,11,-2,10};

        for(int i:arr){

            evenOrOdd(i);
        }
    }

    public static void evenOrOdd(int number){
        //All even numbers are divisible by two, with no remainder
        if(number % 2 == 0){

            System.out.println("even");
        }else{

            System.out.println("odd");
        }
    }
}
