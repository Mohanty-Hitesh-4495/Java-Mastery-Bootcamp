package ExamPrep.Module2;

// Write a Java program defining a class named Ball with two instance variables
// (radius and colour) and demonstrating the use of chaining constructors

class Ball {
    private double radius;
    private String color;

    // Default constructor with default values
    public Ball() {
        this(1.0); // Calls parameterized constructor with default radius
    }

    // Parameterized constructor for setting radius
    public Ball(double radius) {
        this(radius, "red"); // Calls another constructor with radius and default color
    }

    // Parameterized constructor for setting radius and color
    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Method to get radius
    public double getRadius() {
        return radius;
    }

    // Method to get color
    public String getColor() {
        return color;
    }
}

public class DemoBall {
    public static void main(String[] args) {
        // Creating Ball objects using different constructors
        Ball defaultBall = new Ball(); // Uses default constructor
        Ball redBall = new Ball(2.5); // Uses parameterized constructor with radius
        Ball customBall = new Ball(3.0, "blue"); // Uses parameterized constructor with radius and color

        // Displaying details of each ball
        displayBallDetails(defaultBall);
        displayBallDetails(redBall);
        displayBallDetails(customBall);
    }

    // Method to display ball details
    public static void displayBallDetails(Ball ball) {
        System.out.println("Ball Radius: " + ball.getRadius());
        System.out.println("Ball Color: " + ball.getColor());
        System.out.println();
    }
}

