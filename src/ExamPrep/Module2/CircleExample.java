package ExamPrep.Module2;
/*
    Write a java program that defines a class ‘Circle’ with instance variables for
    center coordinates and radius, an instance method to calculate perimeter and
    a static method to calculate area.
 */
class Circle1 {
    // Instance variables
    private double x; // x-coordinate of center
    private double y; // y-coordinate of center
    private double radius;

    // Constructor
    public Circle1(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Instance method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Static method to calculate area
    public static double calculateArea(Circle1 ob) {
        return Math.PI * ob.radius * ob.radius;
    }
}

public class CircleExample {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(0, 0, 5); // Center at (0, 0) with radius 5

        // Calculating perimeter using instance method
        double perimeter = circle.calculatePerimeter();
        System.out.println("Perimeter of the circle: " + perimeter);

        // Calculating area using static method
        double area = Circle1.calculateArea(circle); // Using static method with an object
        System.out.println("Area of the circle: " + area);
    }
}
