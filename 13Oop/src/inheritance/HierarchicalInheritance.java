package inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogH tommy = new DogH();
        Cat whiskers = new Cat();

        tommy.bark();   // inheritance.Dog is barking
        tommy.run();    // inheritance.Dog is running on 4 legs
        tommy.eat();    // inheritance.Animal is eating

        whiskers.meow(); // inheritance.Cat is meowing
        whiskers.jump(); // inheritance.Cat is jumping
        whiskers.eat();  // inheritance.Animal is eating
    }
}

class AnimalH {
    public void eat() {
        System.out.println("inheritance.Animal is eating");
    }
}

class DogH extends AnimalH {
    int leg = 4;

    public void bark() {
        System.out.println("inheritance.Dog is barking");
    }

    public void run() {
        System.out.println("inheritance.Dog is running on " + leg + " legs");
    }
}

class Cat extends AnimalH {
    public void meow() {
        System.out.println("inheritance.Cat is meowing");
    }

    public void jump() {
        System.out.println("inheritance.Cat is jumping");
    }
}
