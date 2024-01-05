// Superclass
class Animal {
    // Method to make a generic animal sound
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass extending Animal
class Dog extends Animal {
    // Override makeSound method for a Dog
    @Override
    void makeSound() {
        System.out.println("The Dog barks");
    }
}

// Subclass extending Animal
class Cat extends Animal {
    // Override makeSound method for a Cat
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

// Main class for execution
public class assignmentAbstractInterface2 {

    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat classes
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        
        // Calling makeSound method for each object 
        a.makeSound(); 
        d.makeSound(); 
        c.makeSound(); 
    }
}
