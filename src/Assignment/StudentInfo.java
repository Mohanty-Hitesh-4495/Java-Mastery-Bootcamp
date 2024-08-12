package Assignment;

import java.util.Scanner;

class Student {
    String name;
    int roll;
    float cgpa;

    Student(String name, int roll, float cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }

    float getCGPA() {
        return cgpa;
    }
}

public class StudentInfo {
    static void Sort(Student[] arr) {
        Student temp;
        for (int step = 0; step < (arr.length - 1); step++) {
            for (int i = 0; i < (arr.length - step - 1); i++) {
                if (arr[i].cgpa > arr[i + 1].cgpa) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner ac=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF STUDENTS = ");
        n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE DATA OF STUDENT " + (i + 1));
            System.out.print("NAME= ");
            String name = ac.nextLine();
            System.out.print("ROLL NO.= ");
            int roll = sc.nextInt();
            System.out.print
                    ("CGPA= ");
            float cgpa = sc.nextFloat();
            arr[i] = new Student(name, roll, cgpa);
        }
        float Totalcgpa = 0;
        for (int i = 0; i < arr.length; i++) {
            Totalcgpa += arr[i].getCGPA();
        }
        float AvgCgpa = Totalcgpa / arr.length;
        System.out.println("THE AVERAGE CGPA OF ALL STUDENTS = " + AvgCgpa);
        Sort(arr);
        System.out.println("DISPLAYING THE STUDENT LIST IN DESCENDING ORDER(CGPA)...");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("NAME= " + arr[i].name + " ROLL NO.= " + arr[i].roll + " CGPA= " + arr[i].cgpa);
        }
    }
}
