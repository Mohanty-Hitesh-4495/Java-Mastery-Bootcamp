package AWT;// importing Java AWT class
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// extending Frame class to our class AWT.AWTExample1
public class AWTExample1 extends Frame {

    // initializing using constructor
    AWTExample1() {
        Label l= new Label("WELCOME TO GANDHI INSTITUTE FOR TECHNOLOGY");
        l.setBounds(10,30,400,40);
        add(l);
        Label k= new Label("NAME: ");
        k.setBounds(10,60,400,40);
        add(k);
        TextField n = new TextField();
        n.setBounds(10,80,310,80);
        add(n);
        // creating a button
        Button b = new Button("Click Me!!");
        // setting button position on screen
        b.setBounds(120,180,80,30);
        // adding button into frame
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // frame size 300 width and 300 height
        setSize(350,400);
        // setting the title of Frame
        setTitle("This is our basic AWT example");
        // no layout manager
        setLayout(null);
        setBackground(Color.lightGray);
        // now frame will be visible, by default it is not visible
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // main method
    public static void main(String[] args) {

// creating instance of Frame class
        AWTExample1 f = new AWTExample1();

    }

}