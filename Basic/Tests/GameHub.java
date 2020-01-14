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
        NameGenerator();


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
          //RockPaperScissors();
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

// --------------------------------------------------------------------------------------------------- DELAY

    public static void delay(int delaySelect) {
      try {
          Thread.sleep(delaySelect);
      }
      catch (Exception e) {
          System.out.print("Error " + e);
      }
  }

// --------------------------------------------------------------------------------------------------- ROCK PAPER SCISSORS
/*
    public static void RockPaperScissors() {
      System.out.println("Welcome to Tic-Tac-Toe!... Oh wait this is Rock-Paper-Scissors... Uhh well welcome anyways!");
      System.out.println("You will be facing against me, " + firstNameNG);
    }
*/
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
        delay(2000);
        System.out.println("3...");
        delay(1000);
        System.out.println("2...");
        delay(1000);
        System.out.println("1...");
        delay(1000);
        System.out.println("BEGIN!");
        delay(500);
      }
      else if (userAnswerLW.equals("Y")) {
        System.out.println("Hopefully this will open your eyes to the true odds of the lottery. Good luck.");
        delay(2000);
        System.out.println("3...");
        delay(1000);
        System.out.println("2...");
        delay(1000);
        System.out.println("1...");
        delay(1000);
        System.out.println("BEGIN!");
        delay(500);
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

    public static void NameGenerator() {
        Random r = new Random();

        int genderSelectNG, firstChoiceNG, lastChoiceNG;
        String firstNameNG, lastNameNG, finalNameNG;
    
        lastNameNG = "";
        firstNameNG = "";
    
        genderSelectNG = 1 + r.nextInt(2);
        firstChoiceNG = 1 + r.nextInt(10);
        lastChoiceNG = 1 + r.nextInt(20);
    
    
    
    
        if (genderSelectNG == 1) {
          // MALE
    
          if (firstChoiceNG == 1) {
            firstNameNG = "Mason";
          }
          else if (firstChoiceNG == 2) {
            firstNameNG = "Liam";
          }
          else if (firstChoiceNG == 3) {
            firstNameNG = "Noah";
          }
          else if (firstChoiceNG == 4) {
            firstNameNG = "Logan";
          }
          else if (firstChoiceNG == 5) {
            firstNameNG = "James";
          }
          else if (firstChoiceNG == 6) {
            firstNameNG = "Oliver";
          }
          else if (firstChoiceNG == 7) {
            firstNameNG = "Elijah";
          }
          else if (firstChoiceNG == 8) {
            firstNameNG = "Benjamin";
          }
          else if (firstChoiceNG == 9) {
            firstNameNG = "William";
          }
          else if (firstChoiceNG == 10) {
            firstNameNG = "Lucas";
          }
          
        }
    
    
        else if (genderSelectNG == 2) {
          // FEMALE
          
          if (firstChoiceNG == 1) {
            firstNameNG = "Emma";
          }
          else if (firstChoiceNG == 2) {
            firstNameNG = "Olivia";
          }
          else if (firstChoiceNG == 3) {
            firstNameNG = "Ava";
          }
          else if (firstChoiceNG == 4) {
            firstNameNG = "Isabella";
          }
          else if (firstChoiceNG == 5) {
            firstNameNG = "Sophia";
          }
          else if (firstChoiceNG == 6) {
            firstNameNG = "Charlotte";
          }
          else if (firstChoiceNG == 7) {
            firstNameNG = "Mia";
          }
          else if (firstChoiceNG == 8) {
            firstNameNG = "Amelia";
          }
          else if (firstChoiceNG == 9) {
            firstNameNG = "Harper";
          }
          else if (firstChoiceNG == 10) {
            firstNameNG = "Evelyn";
          }
    
        }
        
    
        else {
          System.out.println("NAME GENERATOR ERROR - RANDOM VALUE FIRST OFF");
        }
    
    
        if (lastChoiceNG == 1) {
            lastNameNG = "Smith";
          }
        else if (lastChoiceNG == 2) {
            lastNameNG = "Hall";
          }
        else if (lastChoiceNG == 3) {
            lastNameNG = "Stewart";
          }
        else if (lastChoiceNG == 4) {
            lastNameNG = "Price";
          }
        else if (lastChoiceNG == 5) {
            lastNameNG = "Johnson";
          }
        else if (lastChoiceNG == 6) {
            lastNameNG = "Allen";
          }
        else if (lastChoiceNG == 7) {
            lastNameNG = "Sanchez";
          }
        else if (lastChoiceNG == 8) {
            lastNameNG = "Bennett";
          }
        else if (lastChoiceNG == 9) {
            lastNameNG = "Bell";
          }
        else if (lastChoiceNG == 10) {
            lastNameNG = "Taylor";
          }
        else if (lastChoiceNG == 11) {
            lastNameNG = "Murphy";
          }
        else if (lastChoiceNG == 12) {
            lastNameNG = "Jenkins";
          }
        else if (lastChoiceNG == 13) {
            lastNameNG = "Jackson ";
          }
        else if (lastChoiceNG == 14) {
            lastNameNG = "Nelson";
          }
        else if (lastChoiceNG == 15) {
            lastNameNG = "Cox";
          }
        else if (lastChoiceNG == 16) {
            lastNameNG = "Washington";
          }
        else if (lastChoiceNG == 17) {
            lastNameNG = "Martin";
          }
        else if (lastChoiceNG == 18) {
            lastNameNG = "Butler";
          }
        else if (lastChoiceNG == 19) {
            lastNameNG = "Turner";
          }
        else if (lastChoiceNG == 20) {
            lastNameNG = "Roberts";
          }
        else {
          System.out.println("NAME GENERATOR ERROR  - RANDOM VALUE LAST OFF");
        }
    
    
        finalNameNG = (firstNameNG + " " + lastNameNG);
    }
}