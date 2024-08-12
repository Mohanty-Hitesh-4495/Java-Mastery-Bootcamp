package JavaTraining;
// Example: Demonstration of interface.
// interface we cannot have a constructor
interface Example{
    int a = 10;// variables are static and final
    int b = 30;
    void exam();// by-default abstract method need to  be overridden.
    static void x1(){
        System.out.println("HITESH");
    }
}
class Example2 implements Example{
    @Override
    public void exam() {
        System.out.println("RAHUL");
    }
    public void example2(){
        System.out.println("SATYAJIT");
    }

}
public class DemoInterface {
    public static void main(String[] args) {
        Example2 ob = new Example2();
        ob.exam();
        ob.example2();
        Example.x1();
        System.out.println(Example.a);
        System.out.println(ob.a);
    }
}
