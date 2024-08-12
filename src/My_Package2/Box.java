package My_Package2;

import My_Package1.Rectangle;
import java.util.Scanner;
public class Box extends Rectangle {
    double height;
    Box(){
    }
    Box(double l,double w,double h){
        super(l,w);
        this.height=h;
    }
    void Dsply(){
        System.out.println("DISPLAYING ALL DATA OF BOX...");
        System.out.println("LENGTH= "+ length+" WIDTH= "+width+" HEIGHT= "+height);
    }
    double SurfaceArea(Box B) {
        return 2*(B.length*B.width+B.length*B.height+B.width*B.height);
    }
    static double volume(double l,double w,double h){
        return l*w*h;
    }
}
class DemoBox{
    public static void main(String[] args) {
        double h,l,w;
        System.out.print("ENTER THE LENGTH OF BOX= ");
        Scanner sc=new Scanner(System.in);
        l=sc.nextDouble();
        System.out.print("ENTER THE WIDTH OF BOX= ");
        w=sc.nextDouble();
        System.out.print("ENTER THE HEIGHT OF BOX= ");
        h=sc.nextDouble();
        Box B=new Box(l,w,h);
        B.display();
        System.out.println("AREA OF RECTANGLE= "+B.Area());
        B.Dsply();
        System.out.println("SURFACE AREA OF BOX= "+B.SurfaceArea(B));
        System.out.println("VOLUME OF BOX= "+Box.volume(l,w,h));
    }
}