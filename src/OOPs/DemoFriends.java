package OOPs;

import java.util.ArrayList;
import java.util.Scanner;
// write a program to make a list of your fiends name.

class Friend{
    String name;
    boolean tea;
    boolean coffee;
    void setFriend(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NAME OF FRIEND : ");
        this.name=sc.nextLine();
        System.out.print("TEA (true/false) : ");
        this.tea=sc.nextBoolean();
        System.out.print("COFFEE (true/false) : ");
        this.coffee=sc.nextBoolean();
    }
    void getTea(){
        if(tea)
            System.out.println(name);
    }
    void getCoffee(){
        if(coffee)
            System.out.println(name);
    }
    void getBoth(){
        if(tea && coffee)
            System.out.println(name);
    }
    void getNull(){
        if(!tea && !coffee){
            System.out.println(name);
        }
    }
}
public class DemoFriends {
    public static void main(String[] args) {
        ArrayList<Friend> name = new ArrayList<>();
        int opt;
        do{
            System.out.println("MAIN MENU:");
            System.out.println("1. ADD FRIEND.");
            System.out.println("2. FRIENDS WHO LIKES TEA.");
            System.out.println("3. FRIENDS WHO LIKES COFFEE.");
            System.out.println("4. FRIENDS WHO LIKES BOTH.");
            System.out.println("5. FRIENDS WHO DON'T LIKE BOTH.");
            System.out.println("6. EXIT.");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE:");
            Scanner sc = new Scanner(System.in);
            opt=sc.nextInt();
            switch (opt){
                case 1 -> {
                        Friend f = new Friend();
                        f.setFriend();
                        name.add(f);
                    }
                case 2 -> {
                    System.out.println("*** FRIENDS WHO LIKES TEA ***");
                    for(Friend arr: name) {
                        arr.getTea();
                    }}
                case 3 -> {
                    System.out.println("*** FRIENDS WHO LIKES COFFEE ***");
                    for(Friend arr: name){
                        arr.getCoffee();
                    }}
                case 4 -> {
                    System.out.println("*** FRIENDS WHO LIKES BOTH ***");
                    for(Friend arr: name){
                        arr.getBoth();
                    }}
                case 5 -> {
                    System.out.println("*** FRIENDS WHO DON'T LIKE BOTH ***");
                    for(Friend arr: name){
                        arr.getNull();
                    }}
                case 6 -> {
                    System.out.println("EXITING FROM PROGRAM...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("PLEASE ENTER A VALID CHOICE.");
                }
            }
        }while(true);
    }

}
