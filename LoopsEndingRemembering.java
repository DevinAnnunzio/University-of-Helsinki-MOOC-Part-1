import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);       
        boolean decision = true;
        int counterForUser = 0;
        int totalInputs = 0;
        int evenNums = 0;
        int oddNums = 0;
        
        
        while(decision == true){
             System.out.println("Type numbers: ");
            int userNumInput = Integer.parseInt(reader.nextLine());
            
            counterForUser +=userNumInput;
            totalInputs+=1;
            
            if(userNumInput>0 && userNumInput % 2 == 0){
                evenNums++;
                
            }
            
            if(userNumInput>0 && userNumInput % 2 != 0){
                oddNums++;
                
            }
            

              
            if(userNumInput == -1){
            System.out.println("Thank you and see you later!");
            counterForUser +=1;
            decision = false;
            totalInputs -=1;
        }
            
        }
        
           
        System.out.println("The sum is: "+ counterForUser);
        System.out.println("How many numbers: " + totalInputs);
        double averageInputs = (double)counterForUser/totalInputs;
        System.out.println("Average: " + averageInputs);
        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd numbers: " + oddNums);

    }
}
