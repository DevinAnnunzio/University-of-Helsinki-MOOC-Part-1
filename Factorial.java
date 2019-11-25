import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int last = Integer.parseInt(reader.nextLine());
        
        int x = 1;
        int sum = 1;
        
        if(last == 0){
                sum =1;
                System.out.println("Factorial is" + sum);
            }
        
        while(x<=last){
            sum *= x;
            x++;          
            
        }
        System.out.println("Factorial is "+sum);
        
    }

    }

