public class Task8 {

    public static void main(String[] args){

        //Array to hold numbers to test function
        int [] arr = {1,0,100,60,30,-53,9000};

        for(int number: arr){

            if(number < 0){

                System.out.println("Incorrect input: " + number);
            }else {
                convertToHoursAndMinutes(number);
            }
        }
    }

    public static void convertToHoursAndMinutes(int number){

        String hourOrHours = "hours";
        String minuteOrMinutes = "minutes";
        int numberOfHours = number/60;
        int numberOfMinutes = number % 60;

        if(numberOfHours == 1){

            hourOrHours = "hour";
        }

        if(numberOfMinutes == 1){
            minuteOrMinutes = "minute";
        }

        System.out.println(numberOfHours + " " + hourOrHours  +", " + numberOfMinutes + " " + minuteOrMinutes);
    }
}
