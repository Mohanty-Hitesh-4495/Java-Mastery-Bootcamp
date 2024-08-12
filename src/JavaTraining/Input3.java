import java.io.Console;
public class Input3 {
    public static void main(String[] args) {
        System.out.println("ENTER THE FIRST NUMBER = ");
        Console con=System.console();
        String s1=con.readLine();
        int a=Integer.parseInt(s1);
        System.out.println("ENTER THE SECOND NUMBER = ");
        String s2=con.readLine();
        int b=Integer.parseInt(s2);
        int total=a+b;
        System.out.println("TOTAL= "+total);
    }
}
