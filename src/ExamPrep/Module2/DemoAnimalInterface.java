package ExamPrep.Module2;

//Create an Animal interface with methods void makeSound() and void move().
//Implement this interface in classes representing two different animals, such as
//Dog and Cat.

// Animal interface
interface Animals {
    void makeSound();
    void move();
}

// Dog class implementing Animal interface
class Doggy implements Animals {
    @Override
    public void makeSound() {
        System.out.println("Dog makes barking sound.");
    }
    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}

// Cat class implementing Animal interface
class Cat implements Animals{
    @Override
    public void makeSound() {
        System.out.println("Cat makes meowing sound.");
    }
    @Override
    public void move() {
        System.out.println("Cat-Walk.");
    }
}

public class DemoAnimalInterface {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animals dog = new Doggy();
        Animals cat = new Cat();

        // Calling methods for Dog and Cat
        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        System.out.println("\nCat:");
        cat.makeSound();
        cat.move();
    }
}
