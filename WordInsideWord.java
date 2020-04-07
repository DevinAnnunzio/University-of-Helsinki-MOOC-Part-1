
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                        
        System.out.println("Type the first word: ");
        
        String fWord = reader.next();
        
        System.out.println("Type the second word");
        
        String sWord = reader.next();
        

       
        
        // set it != because -1 = the word isn't found
        
        if(fWord.indexOf(sWord)!= -1 ){
            System.out.println("The word "+ sWord+ (" is found in the word ") + fWord + ".");
        }
        
        else{
            System.out.println("The word "+ sWord+ (" is not found in the word ") + fWord + ".");
        }
        
    }
    }

