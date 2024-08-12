package ExamPrep.Module2;
/*
Write a Java program that prints details for five students, including their roll
number, name, and age. The roll number should be assigned automatically
from 2023001 and increment for each student
 */
class Students {
    private static int rollNumberCounter = 2023001; // Initial roll number starting point
    private int rollNumber;
    private String name;
    private int age;

    // Constructor to initialize name and age and assign roll number automatically
    public Students(String name, int age) {
        this.rollNumber = rollNumberCounter++;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating objects for five students
        Students[] students = new Students[5];
        students[0] = new Students("Hitesh", 21);
        students[1] = new Students("Naina", 21);
        students[2] = new Students("Anjani", 19);
        students[3] = new Students("Archita", 22);
        students[4] = new Students("Gayatri", 19);

        // Displaying details for each student
        for (Students student : students) {
            student.displayDetails();
        }
    }
}

