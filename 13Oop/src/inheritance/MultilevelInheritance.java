package inheritance;

public class MultilevelInheritance extends Dogm {
    public static void main(String[] args) {
        MultilevelInheritance instance = new MultilevelInheritance();

        instance.bark(); // inheritance.Dog is barking
        instance.run();  // inheritance.Dog is running on 4 legs
        instance.eat();  // inheritance.Animal is eating
        instance.sleep(); // inheritance.Animal is sleeping
    }
}

class Animalm {
    public void eat() {
        System.out.println("inheritance.Animal is eating");
    }

    public void sleep() {
        System.out.println("inheritance.Animal is sleeping");
    }
}

class Dogm extends Animalm {
    int leg = 4;
    int eyes = 2;

    public void bark() {
        System.out.println("inheritance.Dog is barking");
    }

    public void run() {
        System.out.println("inheritance.Dog is running on " + leg + " legs");
    }
}
