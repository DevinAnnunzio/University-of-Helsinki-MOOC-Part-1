import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        String uWord = "Hi";
        //while uWord is not empty
        while(!uWord.isEmpty()){
        
        System.out.println("Type a word: ");
        uWord = reader.nextLine();
        words.add(uWord);
        }
        
        for(String addedWord:words){
            System.out.println(addedWord);
        }
        
        
    }
}
