package ExamPrep.Module5;

import java.awt.*;
import java.awt.event.*;

//How do you handle window closing events in AWT? Provide an example using WindowListener.

public class WindowClosingExample {
    public static void main(String[] args) {
        // Create a Frame (window)
        Frame frame = new Frame("Window Closing Example");

        // Create an instance of WindowListener
        WindowListener windowListener = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing...");
                System.exit(0); // Close the application when the window is closing
            }
        };

        // Add the WindowListener to the frame
        frame.addWindowListener(windowListener);

        // Set size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
