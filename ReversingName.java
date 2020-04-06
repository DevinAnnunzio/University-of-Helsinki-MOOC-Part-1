import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String userInp = reader.nextLine();
        int i = userInp.length()-1;
        
        System.out.print("In reverse order:");
        
        while(i>=0){
            System.out.print(userInp.charAt(i));
            i--;
        }
        

        
    }
}
