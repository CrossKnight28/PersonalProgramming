import javax.swing.*;
import java.awt.*;

public class GUIMaking
{
    public static void main( String[] args)
    {
        CreateGUI f = new CreateGUI();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // let's us close the popup with the mouse
        f.setVisible(true); // We don't see the popup appear without this
    }
}

// Create a Frame
// Add the panel you created below to the frame
class CreateGUI extends JFrame {
    public CreateGUI() {
        setTitle("Square?"); // title that appears in popup
        setSize(900, 500); // width and height in pixels
        setLocation(500, 500); // location that popup appears x and y

        // We need to have a panel if we want to add Graphics
        Panel panel = new Panel(); //new panel object
        panel.setBackground(Color.GREEN); //Sets the panel background color to cyan
        Container cp = getContentPane(); // gets the container for the current frame this is required.
        cp.add(panel); // lets the container know that we are adding our panel from above
    }
}

// Create a Panel
// Text and shapes here
class Panel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 36));
        g.drawString("This is not a square, its a rectangle.", 250, 250); // Adds words to our popup drawString(message, x, y)

        g.setColor(Color.BLACK); // sets the fill to white for all shapes below this line
        g.fillRect(0, 0, 199, 99);
    }
}