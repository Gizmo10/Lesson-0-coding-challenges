public class Task2 {

    public static void main(String [] args){

        int x = 1 + 1 * 2;
        int y = (1 + 1) * 2;
        int z = 1 + (1 * 2);
        int a = 1 + 1 * 2 / 2;
        int b = (1 + 1 * 2) / 2;

        int [] arrayOfIntegers = {x,y,z,a,b};

        for(int i:arrayOfIntegers){

            System.out.println(i);
        }
    }
}
