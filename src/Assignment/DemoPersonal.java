package Assignment;
import java.util.Scanner;
class Personal {
   static String name;
   static int age;
    Personal(){
        Personal.age=18;
    }
    Personal(String name,int age){
        Personal.age =age;
        Personal.name=name;
    }
    public void info(){
        System.out.println("NAME = "+Personal.name+" AGE = "+Personal.age);
    }
   static void setAge(int age){
        Personal.age=age;
    }
   static void setName(String name) {
        Personal.name=name;
   }
}
public class DemoPersonal{
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NAME...");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Personal.setName(name);
        System.out.println("ENTER YOUR AGE...");
        int age=sc.nextInt();
        Personal.setAge(age);
        Personal p1=new Personal(name,age);
        p1.info();
        Personal p2=new Personal();
        p2.info();
    }
}
