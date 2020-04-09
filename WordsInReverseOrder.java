import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String>words = new ArrayList<String>();
        
        String usersWord;
        
        while(true){
            System.out.println("Type a word: ");
            usersWord = reader.nextLine();
            if(usersWord.equals("")){
                break;
            }
            words.add(usersWord);  
        }
        
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for(String userInput:words){
            System.out.println(userInput);
        }
        
    }
}
