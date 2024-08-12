package OOPs;// class flower with two abstract method colour and smell.
// extend it to another class rose and write a java program to demonstrate.

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
public class DemoFlower {
    public static void main(String[] args) {
        Flower ob = new Rose();
        ob.colour();
        ob.smell();
    }
}
