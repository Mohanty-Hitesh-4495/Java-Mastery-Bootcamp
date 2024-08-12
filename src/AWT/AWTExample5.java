package AWT;

import java.awt.*;

public class AWTExample5 {
    Frame f;
    Button b1,b2,b3,b4,b5;

    AWTExample5(){
        f = new Frame("India");
        b1 = new Button("s");
        b1.setBackground(Color.RED);
        b2 = new Button("s");
        b2.setBackground(Color.BLUE);
        b3 = new Button("s");
        b3.setBackground(Color.GREEN);
        b4 = new Button("s");
        b4.setBackground(Color.CYAN);
        b5 = new Button("s");
        b5.setBackground(Color.MAGENTA);
        f.setLayout(new BorderLayout());
        f.add(b1,BorderLayout.WEST);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);
        f.setSize(500,500);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AWTExample5 ob = new AWTExample5();
    }
}
