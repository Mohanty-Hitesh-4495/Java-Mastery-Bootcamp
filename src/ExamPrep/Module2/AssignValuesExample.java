package ExamPrep.Module2;

//Write an example program to show three different ways to assign values to the data members in a class. Use appropriate comment lines.
class ExampleClass {
    int number;// Data members
    String text;// Data members

    // Method 1: Using Constructor
    public ExampleClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
    // Method 2: Using Setter Methods
    public void setValues(int number, String text) {
        this.number = number;
        this.text = text;
    }
    // Method to display values
    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

public class AssignValuesExample {

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass(10, "Hitesh"); // Method 1: Using Constructor
        obj.displayValues();

        obj.setValues(20, "Rahul"); // Method 2: Using Setter Methods
        obj.displayValues();

        // Method 3: Direct Assigning
        obj.number=30;
        obj.text="Srinibash";
        obj.displayValues();

    }
}
