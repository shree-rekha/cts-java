package JAVA;
// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the base class
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        // Creating an object of the subclass
        Dog myDog = new Dog();
        myDog.makeSound();     // Output: Bark
    }
}
