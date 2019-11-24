
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int until = Integer.parseInt(reader.nextLine());
        
        int x=0;
        int sum = 0;
        
        //while x is less than the supplied number
        while(x<=until){
            //add sum to x
            sum+=x;
            //add 1 to x
            x++;
        }
        System.out.println("Sum is: " + sum);
    }
}
