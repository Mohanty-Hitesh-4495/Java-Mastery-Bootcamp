// Taking input using JOptionpane fromjavax.swing package....
import javax.swing.*;
public class Input1 {
    public static void main(String[] args) {
        String s1=JOptionPane.showInputDialog("ENTER THE FIRST NUMBER = ");
        //convert string to int
        int a=Integer.parseInt(s1);
        String s2=JOptionPane.showInputDialog("ENTER THE SECOND NUMBER = ");
        int b=Integer.parseInt(s2);
        int total=a+b;
        System.out.println("TOTAL= "+total);
    }
}
