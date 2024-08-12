package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

interface Find{
    public boolean search(int a);
    public boolean search(double a);
}
interface Look{
    public boolean search(char a);
    public boolean search(String a);
}
class MyVariable implements Look,Find{
    ArrayList<Integer> integer= new ArrayList<>();
    ArrayList<String> string= new ArrayList<>();
    ArrayList<Character> character= new ArrayList<>();
    ArrayList<Double> numbers= new ArrayList<>();

    public boolean search(int a){
        for(Integer value: integer){
            if(a==value)
                return true;
        }
        return false;
    }
    public boolean search(double a){
        for(Double value: numbers){
            if(a==value)
                return true;
        }
        return false;
    }
    public boolean search(char a){
        for(Character value: character){
            if(a==value)
                return true;
        }
        return false;
    }
    public boolean search(String a){
        for(String value: string){
            if(a.equals(value))
                return true;
        }
        return false;
    }
    void setInteger(){
        System.out.println("SET INTEGER VALUES IN ARRAY");
        Scanner sc = new Scanner(System.in);
        int n=0;
        while (n<5){
            System.out.print("ENTER A INTEGER:");
            int a=sc.nextInt();
            integer.add(a);
            n++;
        }
    }
    void setString(){
        System.out.println("SET STRING VALUES IN ARRAY");
        Scanner sc = new Scanner(System.in);
        int n=0;
        while (n<5){
            System.out.print("ENTER A STRING:");
            String a=sc.nextLine();
            string.add(a);
            n++;
        }
    }
    void setCharacter(){
        System.out.println("SET CHARACTER VALUES IN ARRAY");
        Scanner sc = new Scanner(System.in);
        int n=0;
        while (n<5){
            System.out.print("ENTER A CHARACTER:");
            char a=sc.next().charAt(0);
            character.add(a);
            n++;
        }
    }
    void setNumbers(){
        System.out.println("SET NUMBERS VALUES IN ARRAY");
        Scanner sc = new Scanner(System.in);
        int n=0;
        while (n<5){
            System.out.print("ENTER A NUMBER:");
            double a=sc.nextDouble();
            numbers.add(a);
            n++;
        }
    }
}
public class DemoInterface3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyVariable ob = new MyVariable();
        do{
            System.out.println("****** MAIN MENU ******");
            System.out.println("1. SET VALUES INTO ARRAY");
            System.out.println("2. SEARCH AN INTEGER VALUE");
            System.out.println("3. SEARCH AN DOUBLE VALUE");
            System.out.println("4. SEARCH AN CHARACTER VALUE");
            System.out.println("5. SEARCH AN STRING VALUE");
            System.out.println("6. DISPLAY ARRAYLIST");
            System.out.println("7. EXIT");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE : ");
            int opt=sc.nextInt();
            switch(opt){
                case 1->{
                    ob.setInteger();
                    ob.setCharacter();
                    ob.setNumbers();
                    ob.setString();
                }
                case 2->{
                    System.out.print("ENTER THE INTEGER NUMBER:");
                    int a = sc.nextInt();
                    System.out.println(ob.search(a));
                }
                case 3->{
                    System.out.print("ENTER THE DOUBLE NUMBER:");
                    double a = sc.nextDouble();
                    System.out.println(ob.search(a));
                }
                case 4->{
                    System.out.print("ENTER THE CHARACTER VALUE:");
                    sc.nextLine();
                    char a=sc.nextLine().charAt(0);
                    System.out.println(ob.search(a));
                }
                case 5->{
                    System.out.println("ENTER THE STRING VALUE:");
                    sc.nextLine();
                    String a=sc.nextLine();
                    System.out.println(ob.search(a));
                }
                case 6->{
                    System.out.println("DISPLAYING THE LISTS");
                }
                case 7->{
                    System.out.println("EXITING FROM MENU");
                    System.exit(0);
                }
                default -> {
                    System.out.println("INVALID CHOICE...PLEASE TRY AGAIN");
                }
            }
        }while(true);
    }
}
