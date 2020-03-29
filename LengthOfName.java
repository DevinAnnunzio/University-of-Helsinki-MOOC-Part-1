
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        // call your method from here
        int nameNum = calculateCharacters(name);
        System.out.println("Name of characters: " + nameNum);
        
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text){
        int length = text.length();
        return length;
        
    }
    
}
