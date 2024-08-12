package Overloading_Override;
// define a class first with one private int variable
// define a class second extends first with static int variable.
// define a class Third that extends second with one int class/instance variable.
// write an example program to show the instance variable of each class.

class First1{
    private int a=1;
    void display(){
        System.out.println(a);
    }
}
class Second2 extends First1{
    static int a=2;
    @Override
    void display(){
        super.display();
        System.out.println(a);
    }
}
class Third3 extends Second2{
    int a=3;
    @Override
    void display(){
        super.display();
        System.out.println(a);
    }
}
public class DemoExample2 {
    public static void main(String[] args) {
        First1 ob1 = new First1();
        Second2 ob2 = new Second2();
        Third3 ob3 = new Third3();

        System.out.println("FIRST CLASS ");
        ob1.display();
        System.out.println("SECOND CLASS");
        ob2.display();
        System.out.println("THIRD CLASS");
        ob3.display();
    }
}
