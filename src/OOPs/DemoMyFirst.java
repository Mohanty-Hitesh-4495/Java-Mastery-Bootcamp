package OOPs;

import java.util.Scanner;

class MyFirst{
    private int number;
    boolean lab=false;
    static String name;
    void setNumber(int num){
        this.number=num;
    }
    void getNumber(){
        System.out.println(number);
    }
}
class MySecond extends MyFirst{
    void setMyFirst(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        name=sc.nextLine();
        System.out.print("ENTER A BOOLEAN : ");
        lab=sc.nextBoolean();
        System.out.print("ENTER A INTEGER : ");
        int num= sc.nextInt();
        setNumber(num);
    }
    void getMyFirst(){
        System.out.println(name);
        System.out.println(lab);
        getNumber();
    }
}
public class DemoMyFirst {
    public static void main(String[] args) {
        MySecond ob = new MySecond();
        ob.setMyFirst();
        ob.getMyFirst();
    }
}
