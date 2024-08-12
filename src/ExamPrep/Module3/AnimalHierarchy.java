package ExamPrep.Module3;
/*
Develop a simple animal hierarchy with a base class "Animal" and subclasses
like "Dog," "Cat," and "Bird." Include methods like makeSound() in each
subclass. Create an array of animals and demonstrate polymorphism by calling
the makeSound() method for each animal.
 */

// Animal class (base class)
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound...");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: bhau bhau!");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

// Subclass Bird extending Animal
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps: Chirp chirp!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        // Demonstrate polymorphism by calling makeSound() for each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
