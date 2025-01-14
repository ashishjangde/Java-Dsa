package inheritance;

public class Inheritance extends Dog {
    public static void main(String[] args) {
        Dog tommy = new Dog();

        tommy.bark();
        tommy.eat();
        tommy.sleep();
        tommy.run();
    }
}

class Animal {
    public void eat() {
        System.out.println("inheritance.Animal is eating");
    }

    public void sleep() {
        System.out.println("inheritance.Animal is sleeping");
    }
}

class Dog extends Animal {
    int leg = 4;
    int eyes = 2;

    public void bark() {
        System.out.println("inheritance.Dog is barking");
    }

    public void run() {
        System.out.println("inheritance.Dog is running on " + leg + " legs");
    }
}
