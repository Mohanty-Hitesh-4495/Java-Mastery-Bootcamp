package ExamPrep.Module3;
/*
Define a "Person" class that includes an instance variable called "name."
Implement two methods for greeting individuals, one which includes a name
and one without name. Utilize method overloading to achieve this
functionality
 */
class Person {
    private String name; // Instance variable

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }
    // Method to greet without a name
    public void greet() {
        System.out.println("Hello, "+name+" Welcome!");
    }
    // Method to greet with a specific name
    public void greet(String personName) {
        System.out.println("Hello, " + personName + " Welcome!");
    }
}

public class GreetingExample {
    public static void main(String[] args) {
        Person person1 = new Person("Hitesh");
        // Greet without a name
        person1.greet(); // Calls the method without parameters
        // Greet with a specific name
        person1.greet("Rahul"); // Calls the method with a string parameter
    }
}
