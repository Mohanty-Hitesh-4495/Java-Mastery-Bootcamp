package ExamPrep.Module3;
class Animals {
    void sound(){
        System.out.println("Nahi Pata :)");
    }
}
class Dogs extends Animals {
    @Override
    void sound(){
        System.out.println("Bark...Bark !!!");
    }
}
class Cats extends Animals {
    @Override
    void sound(){
        System.out.println("Meaw...Meaw !!!");
    }
}
public class DemoDispatch {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Animals dog = new Dogs();// subclass reference stored in supercalss object
        Animals cat = new Cats();// subclass reference stored in supercalss object
        animal.sound();
        dog.sound();
        cat.sound();
    }
}
