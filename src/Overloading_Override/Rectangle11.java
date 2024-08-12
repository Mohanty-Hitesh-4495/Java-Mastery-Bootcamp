package Overloading_Override;
// Demonstrate Method overloading and Constructor overloading...
import java.util.Scanner;

class Rectangle1{
    float length,width;
    Rectangle1(){
        this.length=10.25f;
        this.width=5.15f;
    }
    Rectangle1(float a,float b){
        this.length=a;
        this.width=b;
    }
    void set(float a,float b){
        this.length=a;
        this.width=b;
    }
    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length :");
        this.length=sc.nextFloat();
        System.out.print("Enter Width :");
        this.width= sc.nextFloat();
    }
    void display(){
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
    }
}
public class Rectangle11 {
    public static void main(String[] args) {

    }
}
