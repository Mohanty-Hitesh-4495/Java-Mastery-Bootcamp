package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

// write a program to make two list of football players and cricket players. and find which team has more young player.
abstract class Player {
//    String name;
    int age;
    void setPlayer(){
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
    }
}
class FootBall extends Player {
    float getAverage(ArrayList<FootBall> arr){
        float avg=0;int count=0;
        for(Player d:arr){
            avg+=d.age;
            count++;
        }
        return avg/count;
    }
}
class Cricket extends Player {
    float getAverage(ArrayList<Cricket> arr){
        float avg=0;int count=0;
        for(Player d:arr){
            avg+=d.age;
            count++;
        }
        return avg/count;
    }
}
public class DemoPlayers{
    public static void main(String[] args) {
        ArrayList<Cricket> player1 = new ArrayList<>();
        ArrayList<FootBall> player2 = new ArrayList<>();
        FootBall ob2 = new FootBall();
        Cricket ob1 = new Cricket();
        System.out.println("ENTER AGE OF CRICKET PLAYERS : ");
        for(int i=0;i<11;i++){
            System.out.print("PLAYER "+(i+1)+" :");
            ob1.setPlayer();
            player1.add(ob1);
        }
        System.out.println("ENTER NAME AND AGE OF FOOTBALL PLAYERS : ");
        for (int i=0;i<11;i++){
            System.out.print("PLAYER "+(i+1)+" :");
            ob2.setPlayer();
            player2.add(ob2);
        }
        if(ob1.getAverage(player1) < ob2.getAverage(player2))
            System.out.println("MAXIMUM YOUNG PLAYERS ARE IN CRICKET TEAM ");
        else
            System.out.println("MAXIMUM YOUNG PLAYERS ARE IN FOOTBALL TEAM ");
        System.out.println("AVERAGE AGE OF CRICKET PLAYER : "+ob1.getAverage(player1));
        System.out.println("AVERAGE AGE OF FOOTBALL PLAYER : "+ob2.getAverage(player2));
    }
}