package ExamPrep.Module2;
/*
    Provide an example of creating and implementing an abstract class, including
    the use of abstract methods.
*/

// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method to display a message
    public void displayMessage() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Square extending the abstract class Shape
class Square extends Shape {
    private double length;

    // Constructor
    public Square(double length) {
        this.length = length;
    }

    @Override  // Implementing abstract method calculateArea for Rectangle
    public double calculateArea() {
        return length * length;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of Square
        Square ob = new Square(5);

        // Calculating and displaying areas of Square
        System.out.println("Area of Rectangle: " + ob.calculateArea());

        // Invoking the displayMessage method of the Shape class
       ob.displayMessage();
    }
}
