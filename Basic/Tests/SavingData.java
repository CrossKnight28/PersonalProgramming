import java.io.*;
import javax.swing.*;

public class SavingData {
    public static void main(String [] args) {

        String userInput1 = JOptionPane.showInputDialog("Please input a number.");
        String userInput2 = JOptionPane.showInputDialog("Please input a basic sentence.");
        String userInput3 = JOptionPane.showInputDialog("Please input a math equation.");

        

        try {
            PrintStream output = new PrintStream(new
            File("TestingSavingData.txt"));
            output.println(userInput1);
            output.println(userInput2);
            output.println(userInput3);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find or access file.");
        }
    }
}