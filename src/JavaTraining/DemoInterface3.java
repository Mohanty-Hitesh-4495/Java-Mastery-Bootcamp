package JavaTraining;

interface one{
    void name();
}
interface two{
    void roll();
}
interface  three extends one,two {
    void branch();
}
interface four{
    void section();
}
class Student {
    static void gift(){
        System.out.println("GANDHI INSTITUTE FOR TECHNOLOGY");
    }
}
public class DemoInterface3 extends Student implements three,four{


    @Override
    public void name() {
        System.out.println("HITESH MOHANTY");
    }

    @Override
    public void roll() {
        System.out.println("36");
    }

    @Override
    public void branch() {
        System.out.println("CSE");
    }

    @Override
    public void section() {
        System.out.println("GENIUS");
    }

    public static void main(String[] args) {

        gift();

    }
}
