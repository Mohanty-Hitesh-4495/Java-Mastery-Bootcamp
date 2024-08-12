package Overloading_Override;

public class Cat extends Animal{
    static void show(){
        System.out.println("Override.Cat");
    }
    @Override
    void sound(){
        System.out.println("Meaun");
    }
}
 class demoOverride{
    public static void main(String[] args) {
        Cat c=new Cat();
        Animal a=new Animal();
        Animal b=c;
        b.sound();
        a.sound();
        c.sound();
        Cat.show();
        Animal.show();
    }

}