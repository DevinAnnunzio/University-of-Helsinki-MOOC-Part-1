
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        
        int sum = 0;
        int number = 0;
        
        
        while(number<=input){
            
            sum += (int) Math.pow(2,number);
            number++;
            
        }
        System.out.println("The result is " + sum);
    }
}
