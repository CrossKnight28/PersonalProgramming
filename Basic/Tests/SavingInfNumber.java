import java.io.*;
import javax.swing.*;

public class SavingInfNumber {
    public static void main(String [] args) {
        int value, runsBeforeBreak;
        value = 3;
        runsBeforeBreak = 0;

        while (value == 3) {
            runsBeforeBreak++;
            System.out.print(" " + runsBeforeBreak);

            try {
            PrintStream output = new PrintStream(new File("TestingSavingData.txt"));
            output.println(runsBeforeBreak);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find or access file.");
        }
        }
    }
}