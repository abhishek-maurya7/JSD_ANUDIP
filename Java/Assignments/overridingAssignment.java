//parent class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

//child of animal class
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

//child of animal class
class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class overridingAssignment {
    //main method
    public static void main(String[] args) {
        // Creating objects of each class
        Animal a = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Displaying sounds
        System.out.print("Sound from the generic animal: ");
        a.makeSound(); //calling method with parent class object

        System.out.print("Sound from the dog: ");
        myDog.makeSound(); //calling method with child class object

        System.out.print("Sound from the cat: ");
        myCat.makeSound(); //calling method with child class object
    }
}
