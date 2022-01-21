import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task9 {

    public static void main(String [] args){

        printVowelsInWord("Great");
        printVowelsInWord(" ");
        printVowelsInWord("wildebees");
        printVowelsInWord("RECREATIONAL");
        printVowelsInWord("SUstAinAble");

    }

    public static void printVowelsInWord(String word){

        //See getVowels(String w) method below this one
        Set<Character> vowels = new HashSet<>(getVowels(word));

        //keep track of number of vowels printed
        int count = 0;
        Iterator itr = vowels.iterator();

        //Print an empty line if we have no vowels
        System.out.print("Vowels:");
        if(!itr.hasNext()){

            System.out.println(" ");
        }

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

    //The method finds all the vowels
    public static Set<Character> getVowels(String word) {

        Set<Character> vowels = new HashSet<>();

        if (word.length() <= 0) {

            return vowels;
        } else {
            //The word is made lowercase for comparison
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                    vowels.add(c);
                }
            }
        }
        return vowels;
    }
}
