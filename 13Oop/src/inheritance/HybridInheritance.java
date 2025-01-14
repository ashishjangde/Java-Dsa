package inheritance;

public class HybridInheritance {
    public static void main(String[] args) {
        DogHy tommy = new DogHy();
        CatHy whiskers = new CatHy();

        tommy.bark();       // inheritance.Dog is barking
        tommy.run();        // inheritance.Dog is running on 4 legs
        tommy.eat();        // inheritance.Animal is eating
        tommy.cuddle();     // inheritance.Dog is being cuddled

        whiskers.meow();    // inheritance.Cat is meowing
        whiskers.jump();    // inheritance.Cat is jumping
        whiskers.eat();     // inheritance.Animal is eating
        whiskers.cuddle();  // inheritance.Cat is being cuddled
    }
}

class AnimalHy {
    public void eat() {
        System.out.println("inheritance.Animal is eating");
    }

    public void cuddle() {
        System.out.println("inheritance.Animal is being cuddled");
    }
}

class DogHy extends AnimalHy {
    int leg = 4;

    public void bark() {
        System.out.println("inheritance.Dog is barking");
    }

    public void run() {
        System.out.println("inheritance.Dog is running on " + leg + " legs");
    }

}

class CatHy extends AnimalHy {
    public void meow() {
        System.out.println("inheritance.Cat is meowing");
    }

    public void jump() {
        System.out.println("inheritance.Cat is jumping");
    }

    @Override
    public void cuddle() {
        System.out.println("inheritance.Cat is being cuddled");
    }
}
