package ExamPrep.Module2;

// Write a Java program that uses set() and get() methods to access the private
//data members name and age of class ‘Student’.

class Student {
    private String name;
    private int age;

    // Setter method to set the name and age
    public void setNameAge(String name,int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }

    // Getter method to get the age
    public int getAge() {
        return age;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student = new Student();
        // Using set methods to set name and age
        student.setNameAge("John",20);

        // Using get methods to retrieve name and age
        String name = student.getName();
        int age = student.getAge();

        // Displaying the student's information
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

