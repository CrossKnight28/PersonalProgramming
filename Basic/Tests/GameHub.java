import java.util.Random;
import java.util.Scanner;

public class GameHub {
  static Scanner keyboard = new Scanner(System.in);
  static Random rndm = new Random();
    public static void main(String[] args) {
        /*

        Planned Features:
        Select the amount of rounds.
        Use Thread.sleep to make the code feel a little more alive instead of printing/activating instantly.
        Organize the code better than before.
        Use more functions.
        Make it easier to read with stuff like | and ----
        
        */

        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();
        nameGenerator();

        String selectYourGame;
        int unableToType;

        unableToType = 0;


        do {
            // Making fun of user for not being able to select a game.
            if (unableToType == 5) {
                empty();
                System.out.println("Do you even know how to type/spell?");
            }

            else if (unableToType == 10) {
                empty();
                System.out.println("Mate... This is getting ridiculous");
            }

            else if (unableToType == 20) {
                empty();
                System.out.println("And I used to think second-hand embarrasment was fake....");
            }
            unableToType++;

            
            // Intro and game selection
            bar();
            empty();
            System.out.println("Please select one of the following games to play: Rock-Paper-Scissors, Guessing-Game, Lottery-Winner, ");
            System.out.print("> ");
            selectYourGame = keyboard.nextLine();
            empty();

            // Error Message
            if (!(selectYourGame.equals("Rock-Paper-Scissors") || selectYourGame.equals("Guessing-Game") || selectYourGame.equals("Lottery-Winner"))) {
                System.out.println("Error: Game not found. Please input one of the games that you would like to play.");
            }


            // Loop cancel
        } while (!(selectYourGame.equals("Rock-Paper-Scissors") || selectYourGame.equals("Guessing-Game") || selectYourGame.equals("Lottery-Winner")));

        
        // Game Finder
        if (selectYourGame.equals("Rock-Paper-Scissors")) {
          bar();
          RockPaperScissors();
        }
        else if (selectYourGame.equals("Guessing-Game")) {
          bar();
          GuessingGame();
        }
        else if (selectYourGame.equals("Lottery-Winner")) {
          bar();
          LotteryWinner();
        }

    }

// --------------------------------------------------------------------------------------------------- BAR

    public static void bar() {
        System.out.println("- - - - - - - - - - - -");
    }

// --------------------------------------------------------------------------------------------------- EMPTY

    public static void empty() {
        System.out.println("");
    }

// --------------------------------------------------------------------------------------------------- DELAY 1

    public static void delay1() {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.print("Error " + e);
        }
    }

// --------------------------------------------------------------------------------------------------- DELAY 0.5

    public static void delay05() {
        try {
            Thread.sleep(500);
        }
        catch (Exception e) {
            System.out.print("Error " + e);
        }
    }

    // --------------------------------------------------------------------------------------------------- DELAY 2

    public static void delay2() {
      try {
          Thread.sleep(2000);
      }
      catch (Exception e) {
          System.out.print("Error " + e);
      }
  }

// --------------------------------------------------------------------------------------------------- ROCK PAPER SCISSORS

    public static void RockPaperScissors() {
        
    }

// --------------------------------------------------------------------------------------------------- LOTTERY WINNER

    public static void LotteryWinner() {
      String userAnswerLW;
      int lotteryWinnerLW = 3;
      int xLW = 0;
      int yLW = 0;

      System.out.println("This is not much of a game but can be a good lesson. This will print numbers that each simulate 1 lottery ticket trying to hit a winning number, this can take upwards of 20 minutes. Are you ready to begin? Y or N");
      System.out.print("> ");
      userAnswerLW = keyboard.next();
      empty();

      if (userAnswerLW.equals("N")) {
        System.out.println("Well you don't have much of a choice now, so we will bein anyways.");
        delay2();
        System.out.println("3...");
        delay1();
        System.out.println("2...");
        delay1();
        System.out.println("1...");
        delay1();
        System.out.println("BEGIN!");
        delay05();
      }
      else if (userAnswerLW.equals("Y")) {
        System.out.println("Hopefully this will open your eyes to the true odds of the lottery. Good luck.");
        delay2();
        System.out.println("3...");
        delay1();
        System.out.println("2...");
        delay1();
        System.out.println("1...");
        delay1();
        System.out.println("BEGIN!");
        delay05();
      }

      do {

          yLW++;
          xLW = 1 + rndm.nextInt(302200000);
          System.out.println(xLW + " | " + yLW);

      } while (xLW != lotteryWinnerLW);

      System.out.println("Congrats, you won the lottery!");
    }

  // --------------------------------------------------------------------------------------------------- GUESSING GAME

    public static void GuessingGame() {
        int userNum1GG, userNum2GG, winningNumberGG, userGuessGG, attemptsGG;
        attemptsGG = 4;


        System.out.println("Hello, please say what numbers you would like for boundaries. Say the small one first.");
        userNum1GG = keyboard.nextInt();
        userNum2GG = keyboard.nextInt();


        winningNumberGG = userNum1GG + rndm.nextInt(userNum2GG - userNum1GG);
        System.out.println("Guess your number! Its between your values of " + userNum1GG + " and " + userNum2GG + ".");


        do {
            userGuessGG = keyboard.nextInt();

            attemptsGG--;
            
            if (userGuessGG > winningNumberGG) {
                System.out.println("You guessed too high! You only have " + attemptsGG + " attempt(s) remaining.");
            }
            else if (userGuessGG < winningNumberGG) {
                System.out.println("You guessed too low! You only have " + attemptsGG + " attempt(s) remaining.");
            }

        } while (attemptsGG != 0 && userGuessGG != winningNumberGG);

        if (userGuessGG == winningNumberGG) {
            System.out.println("Congrats! You guessed the number!");
        }
        else if (userGuessGG != winningNumberGG) {
            System.out.println("");
            System.out.println("Aw, you didn't guess it. The number was " + winningNumberGG);
        }
    }

// --------------------------------------------------------------------------------------------------- NAME GENERATOR

    public static void nameGenerator() {
        Random r = new Random();

        int genderSelect, firstChoice, lastChoice;
        String firstName, lastName, finalName;
    
        lastName = "";
        firstName = "";
    
        genderSelect = 1 + r.nextInt(2);
        firstChoice = 1 + r.nextInt(10);
        lastChoice = 1 + r.nextInt(20);
    
    
    
    
        if (genderSelect == 1) {
          // MALE
    
          if (firstChoice == 1) {
            firstName = "Mason";
          }
          else if (firstChoice == 2) {
            firstName = "Liam";
          }
          else if (firstChoice == 3) {
            firstName = "Noah";
          }
          else if (firstChoice == 4) {
            firstName = "Logan";
          }
          else if (firstChoice == 5) {
            firstName = "James";
          }
          else if (firstChoice == 6) {
            firstName = "Oliver";
          }
          else if (firstChoice == 7) {
            firstName = "Elijah";
          }
          else if (firstChoice == 8) {
            firstName = "Benjamin";
          }
          else if (firstChoice == 9) {
            firstName = "William";
          }
          else if (firstChoice == 10) {
            firstName = "Lucas";
          }
          
        }
    
    
        else if (genderSelect == 2) {
          // FEMALE
          
          if (firstChoice == 1) {
            firstName = "Emma";
          }
          else if (firstChoice == 2) {
            firstName = "Olivia";
          }
          else if (firstChoice == 3) {
            firstName = "Ava";
          }
          else if (firstChoice == 4) {
            firstName = "Isabella";
          }
          else if (firstChoice == 5) {
            firstName = "Sophia";
          }
          else if (firstChoice == 6) {
            firstName = "Charlotte";
          }
          else if (firstChoice == 7) {
            firstName = "Mia";
          }
          else if (firstChoice == 8) {
            firstName = "Amelia";
          }
          else if (firstChoice == 9) {
            firstName = "Harper";
          }
          else if (firstChoice == 10) {
            firstName = "Evelyn";
          }
    
        }
        
    
        else {
          System.out.println("NAME GENERATOR ERROR - RANDOM VALUE FIRST OFF");
        }
    
    
        if (lastChoice == 1) {
            lastName = "Smith";
          }
        else if (lastChoice == 2) {
            lastName = "Hall";
          }
        else if (lastChoice == 3) {
            lastName = "Stewart";
          }
        else if (lastChoice == 4) {
            lastName = "Price";
          }
        else if (lastChoice == 5) {
            lastName = "Johnson";
          }
        else if (lastChoice == 6) {
            lastName = "Allen";
          }
        else if (lastChoice == 7) {
            lastName = "Sanchez";
          }
        else if (lastChoice == 8) {
            lastName = "Bennett";
          }
        else if (lastChoice == 9) {
            lastName = "Bell";
          }
        else if (lastChoice == 10) {
            lastName = "Taylor";
          }
        else if (lastChoice == 11) {
            lastName = "Murphy";
          }
        else if (lastChoice == 12) {
            lastName = "Jenkins";
          }
        else if (lastChoice == 13) {
            lastName = "Jackson ";
          }
        else if (lastChoice == 14) {
            lastName = "Nelson";
          }
        else if (lastChoice == 15) {
            lastName = "Cox";
          }
        else if (lastChoice == 16) {
            lastName = "Washington";
          }
        else if (lastChoice == 17) {
            lastName = "Martin";
          }
        else if (lastChoice == 18) {
            lastName = "Butler";
          }
        else if (lastChoice == 19) {
            lastName = "Turner";
          }
        else if (lastChoice == 20) {
            lastName = "Roberts";
          }
        else {
          System.out.println("NAME GENERATOR ERROR  - RANDOM VALUE LAST OFF");
        }
    
    
        finalName = (firstName + " " + lastName);
    }
}