package Inheritance;

//Here class 'Inheritance.First' is parent class or super class...
//And 'Inheritance.Second' and 'Inheritance.Third' class are the child class or subclass...
//Super is a keyword or a reference object which can be only used inside the method of child class to refer parent class...
//super keyword can be used only for reference of immediate parent class...
//describe different types of inheritance in java with suitable example...
class First {
    void greet(){
        System.out.println("HI, FIRST!");
    }
}
class Second extends First {
    void greet() {
        System.out.println("HI, SECOND!");
    }
    void greet1(){
        super.greet();
    }
    void greet2(){
        greet1();
        greet();
    }
}
//class Inheritance.Third extends Inheritance.First { //Here Inheritance.Third class inherit Inheritance.First class...
//    void greet() {
//        System.out.println("HI, THIRD!");
//    }
//}
class Third extends Second{// Here Inheritance.Third Class inherit Inheritance.Second class...
    void greet(){
        System.out.println("HI, THIRD!");
    }
    void greet1() {
        super.greet1();
    }
    void greet2(){
        super.greet();//calling greet method of
    }
    void greet3(){
        greet1();
        greet2();
        greet();

    }
}
public class DemoInheritance1 {
    public static void main(String[] args) {
        First F=new First();
        Second S=new Second();
        Third T=new Third();
        F.greet();//Inheritance.First
//        S.greet();//Inheritance.Second
        S.greet1();//Inheritance.First
//        S.greet2();//Inheritance.First,Inheritance.Second
//        T.greet3();//Inheritance.First,Inheritance.Second,Inheritance.Third
//        T.greet1();//Inheritance.First
//        T.greet2();//Inheritance.Second
        T.greet();//Inheritance.Third

    }
}