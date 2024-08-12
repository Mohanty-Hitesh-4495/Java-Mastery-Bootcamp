package ExamPrep.Module2;
/*
    Write a java program that defines a class ‘Rectangle’ with instance variables
    for length and width and includes an instance method to compare length and
    width of a rectangle
 */
class Rectangle1 {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to compare length and width
    public void compareLengthWidth() {
        if (length > width) {
            System.out.println("Length is greater than Width.");
        } else if (length < width) {
            System.out.println("Width is greater than Length.");
        } else {
            System.out.println("Length and Width are equal.");
        }
    }
    void displayInfo(){
        System.out.println("Length of the rectangle: " + length);
        System.out.println("Width of the rectangle: " + width);
    }
}

public class RectangleComparison {
    public static void main(String[] args) {
        // Creating an object of Rectangle
        Rectangle1 rectangle = new Rectangle1(10.5, 5.5); // Length = 10.5, Width = 5.5

        // Comparing length and width of the rectangle
        rectangle.compareLengthWidth();

        // displaying length and width using displayInfo methods
        rectangle.displayInfo();

    }
}

