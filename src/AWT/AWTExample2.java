package AWT;

import java.awt.*;

public class AWTExample2 extends Frame {
    AWTExample2() {
        Button b = new Button("Genius");
        b.setBounds(100,50,80,30);
        add(b);
        Button c = new Button("Brilliant");
        c.setBounds(100,80,80,30);
        add(c);
        Button d = new Button("Smart");
        d.setBounds(100,110,80,30);
        add(d);
        Button e = new Button("Expert");
        e.setBounds(100,140,80,30);
        add(e);
        Button f = new Button("Scholar");
        f.setBounds(100,170,80,30);
        add(f);
        Button g = new Button("Bright");
        g.setBounds(100,200,80,30);
        add(g);
        setSize(300,300);
        setTitle("Java Programming Lab");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWTExample2 f = new AWTExample2();

    }
}
