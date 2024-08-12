package ExamPrep.Module3;

/*
Write an example program to demonstrate both method overloading and
method overriding. Use appropriate comment lines to explain it.
 */

// Parent class with a method
class Parent {
    // Method to demonstrate method overriding
    public void display() {
        System.out.println("Parent's display method");
    }

    // Method overloading with different parameters
    public void show(int num) {
        System.out.println("Parent's show method with one parameter: " + num);
    }
    // Method Overloading with different parameters
    public void show(int num1, int num2) {
        System.out.println("Parent's show method with two parameters: " + num1 + ", " + num2);
    }
}

// Child class extending Parent class
class Child extends Parent {
    // Overriding the display method of the Parent class
    @Override
    public void display() {
        System.out.println("Child's display method");
    }
}

public class MethodOverloadingOverriding {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Method Overriding: Calls the overridden method in Child class
        parentObj.display(); // Calls Parent's display method
        childObj.display();  // Calls Child's display method

        // Method Overloading: Calls different overloaded methods in Parent class
        parentObj.show(10); // Calls Parent's show method with one parameter
        parentObj.show(20,30);   // Calls Parent's show method with two parameters

    }
}

