package ExamPrep.Module2;
/*
    Write a Java program to provide an example of using an interface to achieve
    multiple inheritances.
 */
interface MyInterface1{
    public void name(String name);// abstract method name
}
interface MyInterface2{
    public void roll(int a);// abstract method roll
}

// multiple inheritance using interface
class StudentD implements MyInterface1,MyInterface2{
    public void name(String name){
        System.out.println(name);
    }
    public void roll(int a){
        System.out.println("Roll no = "+a);
    }
}
public class MultipleInheritanceExample{
    public static void main(String[] args) {
        StudentD a=new StudentD();
        a.name("NAME = HITESH MOHANTY");
        a.roll(36);
    }
}