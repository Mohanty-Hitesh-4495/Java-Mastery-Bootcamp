package JavaTraining;
interface Example3{
    int a = 10;// variables are static and final
    int b = 30;
    void exam();// by-default abstract method need to  be overridden.
    static void x1(){
        System.out.println("HITESH");
    }
}
class Example4 implements Example3{
    @Override
    public void exam() {
        System.out.println("RAHUL");
    }
    public void example2(){
        System.out.println("SATYAJIT");
    }

}
public class DemoInterface2 {
    public static void main(String[] args) {
        Example3 ob = new Example4();
        ob.exam();
        Example3.x1();
    }
    }
