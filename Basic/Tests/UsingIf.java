import java.util.Scanner;

public class UsingIf {
    public static void main(String[] args) {

        // Austin Schweickert - 9/17/19

        Scanner keyboard = new Scanner(System.in);
        
        // Variables

        String userInput, option1, option2;
        option1 = ("No");
        option2 = ("Yes");

        // Actual code

        System.out.println("This script is just a test on new stuff. Please type Yes or No below for different results.");
        userInput = keyboard.next();

        if (userInput.equals(option1)) {
            System.out.println("You chose: Yes");
        }

        if (userInput.equals(option2)) {
            System.out.println("You chose: No");
        }

    }
}