
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        String uWord;
        
        while(true){
            System.out.println("Type a word: ");
            uWord = reader.nextLine();
            if(uWord.equals("")){
                break;
                
            }
            words.add(uWord);
        }
        
        Collections.sort(words);
        for(String addWords:words){
            System.out.println(addWords);
        }
        
    }
}
