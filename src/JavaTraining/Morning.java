//import java.lang.String;
//import java.lang.System;
import java.util.Scanner;
public class Morning {
     void Greet(String name){
        System.out.println("GOOD MORNING "+name+"...");
    }
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name=n.nextLine();
        Morning no=new Morning();
        no.Greet(name);
        n.close();
    }
}
