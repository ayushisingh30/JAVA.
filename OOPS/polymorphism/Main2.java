class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();   // Parent reference, child object
        a.makeSound();  // Calls Dog's method

        a = new Cat();
        a.makeSound();  // Calls Cat's method
    }
}