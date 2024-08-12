package My_Package1;
/*
print a package with name my_package1 and include two classes named as rectangle and point.
create another package with name my_package2 that includes two classes one is box class extended from rectangle class or my_package1
and circle class that uses a point object.
*/
import java.util.Scanner;
public class Rectangle{
    public double length,width;
    protected Rectangle(){}
    protected Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    protected static void  info(){
        System.out.println("You are using My_Package1.Rectangle Class");
    }
    public void display(){
        System.out.println("DISPLAYING ALL DATA OF RECTANGLE...");
        System.out.println("LENGTH="+length+" WIDTH="+width);
    }
     public double Area(){
        return length*width;
    }
    public static void main(String[] args) {
        double l,w;
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF RECTANGLE: ");
        l=sc.nextDouble();
        System.out.print("ENTER THE WIDTH OF RECTANGLE: ");
        w=sc.nextDouble();
        Rectangle R=new Rectangle(l,w);
        info();
        R.display();
        System.out.println("AREA OF RECTANGLE IS "+ R.Area());
    }
}

