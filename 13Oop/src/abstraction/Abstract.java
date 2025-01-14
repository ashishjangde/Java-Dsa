package abstraction;

public class Abstract {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.walk();
    }
}


abstract class Animal {
    void eat() {
        System.out.println("eat");
    }
    abstract void walk();
}
class Dog extends Animal {

    @Override
    void walk() {
        System.out.println("walk");
    }
}
