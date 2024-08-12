package OOPs;// write an example program, where parent class 'game' that defines a child class 'play'.
// both are having private member game_name and player_name.
// another member score;

import java.util.Scanner;

class Game{
    private String gameName;
    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.print("GAME NAME : ");
        gameName=sc.nextLine();
    }
    void show(){
        System.out.println("GAME NAME : "+gameName);
    }
    String get(){
        return this.gameName;
    }
}
class Play extends Game{
    private String playerName;
    int score;
    void set(){
        Scanner sc = new Scanner(System.in);
        super.set();
        System.out.print("PLAYER NAME : ");
        playerName= sc.nextLine();
        System.out.print("SCORE : ");
        score=sc.nextInt();
    }
    void show(){
        super.show();
        System.out.println("PLAYER NAME : "+playerName);
        System.out.println("SCORE : "+score);
    }
    void compare(Play object){
        if(this.get().equals(object.get())){
            if(this.score > object.score)
                System.out.println(this.playerName+" IS WINNER.");
            else if(this.score == object.score)
                System.out.println("DRAW");
            else
                System.out.println(object.playerName+" IS WINNER.");
        }
    }
}
public class DemoPlayer {
    public static void main(String[] args) {
        Play player1 = new Play();
        Play player2 = new Play();
        System.out.println("ENTER DETAILS OF PLAYER 1");
        player1.set();
        System.out.println("ENTER DETAILS OF PLAYER 2");
        player2.set();
        player1.compare(player2);
    }
}
