
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        int x = reader.nextInt();
        int a = 0;
        while(a<x){
            a++;
            System.out.println(a);
        }
        
    }
}
