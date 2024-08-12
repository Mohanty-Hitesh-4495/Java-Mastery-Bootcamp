class Animal{
    void sound(){
        System.out.println("Hmmmm!");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Mieun!");
    }
}
class DemoDispatch{
    public static void main(String[] args) {
        Animal A=new Animal();
        Cat C=new Cat();
        Animal B=new Cat();//child class can be used as reference.
        // But parent class cannot be used as reference for child class.
        A.sound();
        B.sound();
        C.sound();
    }

}
