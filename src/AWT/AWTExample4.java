package AWT;

import java.awt.*;

public class AWTExample4 {
    Frame f;
    Button b1,b2,b3,b4;
    TextField t1;
    AWTExample4(){
        f = new Frame("India");
        b1 = new Button("Red");
        b1.setBackground(Color.RED);
        b2 = new Button("Blue");
        b2.setBackground(Color.BLUE);
        b3 = new Button("Green");
        b3.setBackground(Color.GREEN);
        b4 = new Button("Cyan");
        b4.setBackground(Color.CYAN);
        t1 = new TextField();
        f.setLayout(new GridLayout(2,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(400,500);
        f.setVisible(true);
        f.add(t1);
    }

    public static void main(String[] args) {
        AWTExample4 ob = new AWTExample4();
    }
}

