package Class_And_Object;
//create a class shape with two inner classes Rectangle,Circle.
// Write an application program to check whether a rectangle is having more area than given circle...
import java.util.Scanner;
public class Shape {
    class Rectangle {
        float Area(float l,float w){
            float area=l*w;
            return area;
        }
    }
    class Circle{
        double Area(float r){
            double area= (2*3.14*r);
            return area;
        }
    }
    public static void main(String[] args) {
        System.out.print("ENTER THE LENGTH OF RECTANGLE: ");
        Scanner n=new Scanner(System.in);
        float rl,rw,r;
        rl=n.nextFloat();
        System.out.print("ENTER THE WIDTH OF RECTANGLE: ");
        rw=n.nextFloat();
        Shape.Rectangle ob1=new Shape().new Rectangle();
        float area1=ob1.Area(rl,rw);
        Shape.Circle ob2=new Shape().new Circle();
        System.out.print("ENTER THE RADIUS OF CIRCLE: ");
        r=n.nextFloat();
        double area2=ob2.Area(r);
        System.out.println("AREA OF RECTANGLE: "+area1);
        System.out.println("AREA OF CIRCLE: "+area2);
    }
}
