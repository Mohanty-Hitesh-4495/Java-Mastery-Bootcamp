package Inheritance;

// define an interface FLower with one abstract method colour.
// define another interface Floral with one abstract method smell.
// define a class rose to implement multiple inheritance through these two interface
abstract class Flower{
    abstract void colour();
    abstract void smell();
}
class Rose extends Flower{
    void colour(){
        System.out.println("RED");
    }
    void smell(){
        System.out.println("SMELLS GOOD :)");
    }
}
public class DemoFlower2 {
    public static void main(String[] args) {
        Flower ob = new Rose();
        ob.colour();
        ob.smell();
    }
}

