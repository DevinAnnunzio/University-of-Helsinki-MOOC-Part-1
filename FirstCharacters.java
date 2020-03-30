import java.util.Scanner;
/*
Create a program that asks for the user's name and gives its first, 
second and third characters separately. If the name length is less than three, 
the program prints nothing. You do not need to create methods in this exercise.
*/
public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userInp = reader.next();
        
        if(userInp.length() < 3){
            System.out.println("Error");
        }
        else{
            System.out.println("1.character: " + userInp.charAt(0));
            System.out.println("2.character: " + userInp.charAt(1));
            System.out.println("3.character: " + userInp.charAt(2));
        }
        
        
        
    }
}
