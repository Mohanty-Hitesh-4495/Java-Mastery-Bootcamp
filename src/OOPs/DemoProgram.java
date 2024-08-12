package OOPs;

import java.util.Scanner;

class Program{
    String name;
    static int roll;
    Program(){

    }
    Program(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void getName(){
        System.out.println("NAME : "+name);
    }
    static void getRoll(){
        System.out.println("ROLL NUMBER : "+roll);
    }
    void setProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NAME :");
        name=sc.nextLine();
        System.out.print("ENTER ROLL NUMBER : ");
        Program.roll=sc.nextInt();
    }

}
public class DemoProgram {
    public static void main(String[] args) {
        Program ob = new Program();
        ob.setProgram();
        ob.getName();
        Program.getRoll();
        Program ob1 = new Program("SYED SADIQU HUSSAIN",67);
        ob1.getName();
        Program.getRoll();
    }
}
