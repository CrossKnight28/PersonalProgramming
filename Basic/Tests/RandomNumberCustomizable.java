import java.util.Scanner;
import java.util.Random;

public class RandomNumberCustomizable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();


        int userNum1, userNum2, winningNumber, userGuess, attempts;
        attempts = 4;


        System.out.println("Hello, please say what numbers you would like for boundaries. Say the small one first.");
        userNum1 = keyboard.nextInt();
        userNum2 = keyboard.nextInt();


        winningNumber = userNum1 + rndm.nextInt(userNum2 - userNum1);
        System.out.println("Guess your number! Its between your values of " + userNum1 + " and " + userNum2 + ".");


        do {
            userGuess = keyboard.nextInt();

            attempts--;
            
            if (userGuess > winningNumber) {
                System.out.println("You guessed too high! You only have " + attempts + " attempt(s) remaining.");
            }
            else if (userGuess < winningNumber) {
                System.out.println("You guessed too low! You only have " + attempts + " attempt(s) remaining.");
            }

        } while (attempts != 0 && userGuess != winningNumber);

        if (userGuess == winningNumber) {
            System.out.println("Congrats! You guessed the number!");
        }
        else if (userGuess != winningNumber) {
            System.out.println("");
            System.out.println("Aw, you didn't guess it.");
        }
    }
}