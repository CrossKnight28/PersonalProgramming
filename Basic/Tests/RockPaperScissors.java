import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();

        int systemPlay, turns, systemWins, playerWins;
        String userPlay;

        turns = 0;
        playerWins = 0;
        systemWins = 0;

        NameGenerator();

        // 1 Rock - 2 Paper - 3 Scissors

        System.out.println();
        System.out.println("Good Luck!");
        System.out.println();

        

        do {
            System.out.println("Choose one: Rock, Paper, or Scissors?");
            userPlay = keyboard.next();
            System.out.println();
            systemPlay = 1 + rndm.nextInt(3);

            if (systemPlay == 1) {
                if (userPlay.equals("Rock")) {
                    System.out.print("Your opponet also chose Rock! ");
                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("You read eachothers minds, aye?");
                    }
                    else {
                        System.out.println();
                    }
                }
                else if (userPlay.equals("Paper")) {
                    System.out.print("Your opponet chose Rock! ");  
                    playerWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Show him who is boss! Lets hope this luck transfers to the next round!");
                    }
                    else {
                        System.out.println();
                    }

                }
                else if (userPlay.equals("Scissors")) {
                    System.out.print("Your opponet chose Rock! ");  
                    systemWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Aww, seems ya lost this one, better luck next round!");
                    }
                    else {
                        System.out.println();
                    }

                }
            }



            if (systemPlay == 2) {
                if (userPlay.equals("Paper")) {
                    System.out.print("Your opponet also chose Paper! ");
                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("You read eachothers minds, aye?");
                    }
                    else {
                        System.out.println();
                    }
                }
                else if (userPlay.equals("Rock")) {
                    System.out.print("Your opponet chose Paper!! ");  
                    systemWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Aww, seems ya lost this one, better luck next round!");
                    }
                    else {
                        System.out.println();
                    }

                }
                else if (userPlay.equals("Scissors")) {
                    System.out.print("Your opponet chose Paper! ");  
                    playerWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Show him who is boss! Lets hope this luck transfers to the next round!");
                    }
                    else {
                        System.out.println();
                    }

                }
            }



            if (systemPlay == 3) {
                if (userPlay.equals("Scissors")) {
                    System.out.print("Your opponet also chose Scissors! ");

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("You read eachothers minds, aye?");
                    }
                    else {
                        System.out.println();
                    }

                }
                else if (userPlay.equals("Paper")) {
                    System.out.print("Your opponet chose Scissors! ");  
                    systemWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Aww, seems ya lost this one, better luck next round!");
                    }
                    else {
                        System.out.println();
                    }
                }
                else if (userPlay.equals("Rock")) {
                    System.out.print("Your opponet chose Scissors! ");  
                    playerWins++;

                    if (!(systemWins == 2 || playerWins == 2)) {
                        System.out.print("Show him who is boss! Lets hope this luck transfers to the next round!");
                    }
                    else {
                        System.out.println();
                    }

                }
            }
            System.out.println();
        } while (!(systemWins == 2 || playerWins == 2));

        if (systemWins == 2) {
            System.out.println("You loose, play again sometime!");
        }
        else if (playerWins == 2) {
            System.out.println("You win! Play again sometime!");
        }
    }


        // THIS PART IS FOR A LATER VERSION THAT IS A WIP.
    public static void NameGenerator() {
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