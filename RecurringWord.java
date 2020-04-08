
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        String uWord;

        while (true) {
            System.out.println("Type a word: ");
            uWord = reader.nextLine();

            if (words.contains(uWord)) {
                break;
            } else {
                words.add(uWord);
            }
        }

        System.out.println("You gave the word: " + uWord + " twice");

    }
}
