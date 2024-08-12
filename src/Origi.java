import java.util.Scanner;

// write a java program which pou=int is nearer to the origin.

class Point {
    float x1;
    float y1;
    float z1;
    Point(){
    }
    Point(float x,float y,float z){
        this.x1=x;
        this.y1=y;
        this.z1=z;
    } 
    void info(){
        System.out.println("<"+x1+","+y1+","+z1+">");
    }
    float OtoP(){
        float dis = (float)Math.sqrt(x1*x1+y1*y1+z1*z1);
        return dis;
    }
}
class Origi{
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            Point P2=new Point();
            Point P1=new Point();
            System.out.println("ENTER THE COORDINATES OF FIRST POINT :");
            P1.x1=Sc.nextFloat();
            P1.y1=Sc.nextFloat();
            P1.z1=Sc.nextFloat();
            System.out.println("ENTER THE COORDINATES OF SECOND POINT :");
            P2.x1=Sc.nextFloat();
            P2.y1=Sc.nextFloat();
            P2.z1=Sc.nextFloat();
            System.out.print("THE FIRST COORDINATE IS = ");
            P1.info();
            System.out.print("THE SECOND COORDINATE IS = ");
            P2.info();
            System.out.print("THE POINT WHICH IS NEARER TO ORIGIN IS ");
            if(P1.OtoP()<P2.OtoP()){
                P1.info();
            }
            else{
                P2.info();
            }
            Sc.close();
        }
    }
