import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String original = text;
        String reversed="";
        int stringLength = text.length();
        
        for(int i = stringLength-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
            System.out.println("Reversed: " + reversed);
        }
        
        if(original.equals(reversed)){
            return true;
        }
        
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
