//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Example extends JFrame {
//    JLabel l1,l2,l3,l4;
//    JTextField t1,t2,t3;
//    JButton b1;
//    public Example(){ }
//    public Example(String str){ // constructor
//        super(str);
//    }
//    public void setComponents(){
//        l1=new JLabel("Addition of Two Numbers");
//        l2=new JLabel("First Number :");
//        l3=new JLabel("Second Number :");
//        l4=new JLabel("Sum is :");
//        t1=new JTextField();
//        t2=new JTextField();
//        t3=new JTextField();
//        b1=new JButton("Add");
//        setLayout(null);
//        l1.setBounds(70,30,150,20);
//        add(l1);
//        l2.setBounds(30,50,100,20);
//        add(l2);
//        l3.setBounds(30,80,100,20);
//        add(l3);
//        b1.setBounds(85,105,100,20);
//        add(b1);
//        t1.setBounds(135,55,100,20);
//        add(t1);
//        t2.setBounds(135,83,100,20);
//        add(t2);
//        l4.setBounds(30,130,100,20);
//        add(l4);
//        t3.setBounds(135,132,100,20);
//        add(t3);
//        b1.addActionListener(new Handler());
//    }
//    class Handler implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int a=Integer.parseInt(t1.getText());
//            int b=Integer.parseInt(t2.getText());
//            int s=a+b;
//            t3.setText(String.valueOf(s));
//        }
//    }
//    public static void main(String[] args) {
//        Example jf = new Example("Swing Example Frame");
//        jf.setComponents();
//        jf.setSize(300,300);
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}
