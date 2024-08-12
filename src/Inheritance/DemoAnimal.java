package Inheritance;

// Wajp define an "Animal" class and extend it to another class "Inheritance.Dog".
// call a method of animal class that is overridden in the dog class by using a reference variable of animal class
class Animals {
    void getAnimalSound(){
        System.out.println("Hmm Hmm");
    }
}
class Dog extends Animals{
    @Override
    void getAnimalSound(){
        System.out.println("Vow Vow");
    }
}
public class DemoAnimal {
    public static void main(String[] args) {
        Animals ob = new Dog();
        ob.getAnimalSound();
    }
}
