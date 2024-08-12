package Assignment;

import java.util.Scanner;

class Point {
    float x,y,z;
    Point(){}
    Point(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
class Sphere {
    float radius;
    Point center;

    Sphere() {
    }

    Sphere(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    boolean isPointInside(Point point) {
        double distance = Math.sqrt(
                        Math.pow(point.x - center.x, 2) +
                        Math.pow(point.y - center.y, 2) +
                        Math.pow(point.z - center.z, 2)
        );
        return distance <= radius;
    }
}
public class PointSphere {
    public static void main(String[] args) {
        float r;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE RADIUS OF SPHERE: ");
        r=sc.nextFloat();
        Sphere sphere = new Sphere(new Point(0, 0, 0), r);
        float x,y,z;
        System.out.println("ENTER THE COORDINATES OF POINT: ");
        System.out.print("x = ");
        x=sc.nextFloat();
        System.out.print("y = ");
        y=sc.nextFloat();
        System.out.print("z = ");
        z=sc.nextFloat();
        Point testPoint = new Point(x,y,z);
        boolean isInside = sphere.isPointInside(testPoint);

        if (isInside) {
            System.out.println("THE POINT IS INSIDE OF THE SPHERE.");
        } else {
            System.out.println("THE POINT IS OUTSIDE OF THE SPHERE");
        }
    }
}

