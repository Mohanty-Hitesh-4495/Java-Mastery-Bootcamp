package OOPs;
import java.util.Scanner;
// Write a program to take input 5 students information using a student and marks class
// name,age and three subjects marks
// and print them.
public class DemoStudentMarks {
    public static void main(String[] args) {
        Students [] students=new Students[5];
        Marks[] marks = new Marks[5];
        for(int i=0;i<students.length;i++){
            System.out.println("ENTER THE DETAILS OF STUDENT "+(i+1));
            students[i]=new Students();
            students[i].set();
            marks[i]=new Marks();
            marks[i].setMarks();

        }
        for(int i=0;i< students.length;i++) {
            students[i].info();
            marks[i].displayMark();

        }

    }
}
class Students{
    int age;
    String name;
    void set (){
        Scanner Sc=new Scanner(System.in);
        System.out.print("NAME = ");
        this.name=Sc.next();
        System.out.print("AGE = ");
        this.age=Sc.nextInt();
    }
    void info(){
        System.out.println("STUDENT NAME = "+name+" AGE = "+age);
    }
}
class Marks{
    int mark1,mark2,mark3;
    void setMarks(){
        Scanner ab=new Scanner(System.in);
        System.out.print("MARK1 =");
        this.mark1=ab.nextInt();
        System.out.print("MARK2 =");
        this.mark2=ab.nextInt();
        System.out.print("MARK3 =");
        this.mark3=ab.nextInt();
    }
    void displayMark(){
        System.out.println("JAVA= "+mark1);
        System.out.println("MATH = "+mark2);
        System.out.println("DBMS = "+mark3);
    }
}
