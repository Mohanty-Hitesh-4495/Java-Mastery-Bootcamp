package AWT;

import java.awt.*;

public class AWTExample3 {
    Frame f;
    Button b1;
    TextField t1;
    Label l1;
    Checkbox c1,c2;
    CheckboxGroup cbg;
    Checkbox r1,r2;
    List lt;
    Choice ch;
    TextArea ta;
    Scrollbar sb1;
    AWTExample3(){
        f=new Frame("HITESH MOHANTY");
        b1=new Button("Login");
        t1=new TextField(10);
        l1=new Label("Username");
        c1= new Checkbox("java");
        c2=new Checkbox("python");
        cbg=new CheckboxGroup();
        r1=new Checkbox("Pass",cbg,true);
        r2=new Checkbox("Fail",cbg,false);
        lt=new List(2);
        ch= new Choice();


    }


}
