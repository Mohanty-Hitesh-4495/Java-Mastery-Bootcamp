class Point2{
    double x,y,z;
    Point2(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void show(){
        System.out.println("<"+x+","+y+","+z+">");
    }
    double distance(Point2 A){
        return Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2)+Math.pow(this.z-A.z,2));
    }
}
public class MainPoint{
    public static void main(String args[]){
        Point2 p=new Point2(1.0,2.0,3.0);
        Point2 q=new Point2(2.0,-1.0,5.0);
        p.show();
        System.out.println("AND");
        q.show();
        System.out.println("is = "+p.distance(q));

    }
}
