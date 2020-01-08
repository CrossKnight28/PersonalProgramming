import java.util.Scanner; 
import java.util.Random;

public class LotteryWinner {
    public static void main(final String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();
        int lotteryWinner = 3;
        int x = 0;
        int y = 0;

        do {

            y++;
            x = 1 + rndm.nextInt(302200000);
            System.out.println(x + " | " + y);

        } while (x != lotteryWinner);

        System.out.println("Congrats, you won the lottery!");
    }
}