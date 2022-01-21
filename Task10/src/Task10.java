import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task10 {

    public static void main(String[] args){

        printCommonCharacters("grey","broer");
        printCommonCharacters("","Education");
        printCommonCharacters("EvErydAy","yesterday");

    }

    public static void printCommonCharacters(String s1, String s2){
        //Initialise with the Set of common characters
        Set<Character> commonChars = new HashSet<>(getCommonChars(s1,s2));
        Iterator itr = commonChars.iterator();
        int count = 0;

        if(commonChars.size() <= 1){

            System.out.print("Common letter:");
        }else{

            System.out.print("Common letters:");
        }

        while(itr.hasNext()){
            //first char
            if(count == 0){

                System.out.print(" " + itr.next());
                count++;
            }else{

                System.out.print(", " + itr.next());
            }
        }
        //end line
        System.out.println();
    }

    public static Set<Character> getCommonChars(String s1,String s2){

        Set<Character> commonCharacters = new HashSet<>();
        //make the lowercase to compare easier
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i = 0;i < s1.length();i++){
            for(int j = 0;j < s2.length();j++){

                if(s1.charAt(i) == s2.charAt(j)){
                    commonCharacters.add(s1.charAt(i));
                    j = s2.length();
                }
            }
        }

        return commonCharacters;
    }
}
