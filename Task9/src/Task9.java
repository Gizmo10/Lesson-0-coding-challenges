import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task9 {

    public static void main(String [] args){

        printVowelsInWord("Great");
        printVowelsInWord(" ");
        printVowelsInWord("wildebees");
        printVowelsInWord("RECREATIONAL");

    }

    public static void printVowelsInWord(String word){

        Set<Character> vowels = new HashSet<>();

        if(word.length() <= 0){

            System.out.println("The String is empty.");
        }else{

            word = word.toLowerCase();

            for(int i = 0;i < word.length();i++){

                char c = word.charAt(i);

                if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){

                    vowels.add(c);
                }
            }
        }

        //keep track of number of vowels printed
        int count = 0;

        System.out.print("Vowels:");

        Iterator itr = vowels.iterator();

        while(itr.hasNext()){
            //When we are not on the last vowel
            if(count < (vowels.size() - 1)){

                System.out.print(" " + itr.next() + ",");
                count++;
            }else{

                System.out.println(" " + itr.next() + ".");
            }
        }

    }
}
