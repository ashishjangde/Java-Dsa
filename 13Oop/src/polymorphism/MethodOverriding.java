package polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.speak();  // Output: Dog is barking

        Animal myCat = new Cat();
        myCat.speak();  // Output: Cat is meowing
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat is meowing");
    }
}
