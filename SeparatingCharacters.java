
import java.util.Scanner;
/*Create a program that asks for the user's name and 
gives its characters separately. You do not need to 
create methods in this exercise.*/
public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String userInp = reader.nextLine();
        int i = 0;
        
        while(i < userInp.length()){
            
        System.out.println((i+1) + ".Character: " + userInp.charAt(i));
        i++;

        }
        
    }
}
