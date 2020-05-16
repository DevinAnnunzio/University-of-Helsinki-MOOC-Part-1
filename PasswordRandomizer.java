import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int length;
    int index;

    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password 
        //password resets after the for loop adds all to empty string
        String password = "";

        for (int i = 0; i < length; i++) {
            //index stores a random number 0-26, starts at 0
            index = random.nextInt(26);
            //grabs characters in relation to index(#)
            char symbol = "abcdefghijklmnopqrstuvqxyz".charAt(index);
            //builds new string from selected characters
            password += symbol;

        }
        return password;
    }
}