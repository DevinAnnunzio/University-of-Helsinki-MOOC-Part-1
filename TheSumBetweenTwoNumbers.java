
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last number: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while(first<=last){
            sum += first;
            first++;
            
        }
        System.out.println("The sum is "+sum);
        
    }
}
