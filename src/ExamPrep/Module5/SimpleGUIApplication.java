package ExamPrep.Module5;
import javax.swing.*;
import java.awt.event.*;

/*
Create a Java program to build a simple GUI application that includes a frame
with a button. When the button is clicked, display a message.
 */

public class SimpleGUIApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Application");

        // Create a button
        JButton button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the frame's content pane
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
