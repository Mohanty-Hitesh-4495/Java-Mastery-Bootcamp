package ExamPrep.Module2;
/*
    Write a java program to explain the use of keyword ‘super’ for calling the
    superclass constructor, calling the superclass method and accessing the field
    from the superclass.
 */

// Superclass
class Animal {
    String species;
    // Superclass constructor
    public Animal(String species) {
        this.species = species;
    }
    // Superclass method
    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    String breed;
    // Subclass constructor using super to call superclass constructor
    public Dog(String species, String breed) {
        super(species); // Calling superclass constructor
        this.breed = breed;
    }
    // Subclass method using super to invoke superclass method
    public void displayDetails() {
        super.displaySpecies(); // Invoking superclass method
        System.out.println("Breed: " + breed);
    }
    // Accessing superclass field using super
    public void displaySuperSpecies() {
        System.out.println("Superclass species: " + super.species);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        // Creating an object of subclass Dog
        Dog dog = new Dog("janini", "Bula Kukura :)");

        // Invoking subclass method that calls superclass method using super
        dog.displayDetails();

        // Accessing superclass field using super
        dog.displaySuperSpecies();
    }
}

