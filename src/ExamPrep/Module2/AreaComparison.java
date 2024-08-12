package ExamPrep.Module2;
/*
    Write a Java program that defines a Circle class and a Rectangle class, and
    then compares two objects of these classes based on their areas.
 */

// Circle class representing a circle
class Circle {
    private double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class representing a rectangle
class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

public class AreaComparison {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5); // Circle with radius 5
        Rectangle rectangle = new Rectangle(4, 6); // Rectangle with length 4 and width 6

        // Calculating areas of Circle and Rectangle
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        // Comparing areas of Circle and Rectangle
        if (circleArea > rectangleArea) {
            System.out.println("Circle has a larger area than Rectangle.");
        } else if (circleArea < rectangleArea) {
            System.out.println("Rectangle has a larger area than Circle.");
        } else {
            System.out.println("Circle and Rectangle have equal areas.");
        }
    }
}

