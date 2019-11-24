
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // write your code here
        System.out.println("Enter the first number: ");
        int first = reader.nextInt();
        System.out.println("Enter the last number: ");
        int last = reader.nextInt();
        
        if(first>last){
            System.out.println("Error");
        }
            
        else{
            
        while(first<=last){
            System.out.println(first);
            first++;
            
        }
        }

    }
}
