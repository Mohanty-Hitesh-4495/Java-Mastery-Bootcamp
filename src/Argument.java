import java.util.Scanner;

class Suiii{
    int a;
    void show(Suiii ob){
        System.out.println(ob.a);
    }
}
public class Argument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suiii ob = new Suiii();
        System.out.print("Enter a number : ");
        ob.a= sc.nextInt();
        ob.show(ob);
    }
}
