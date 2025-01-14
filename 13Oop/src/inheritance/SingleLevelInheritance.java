package inheritance;

public class SingleLevelInheritance extends Animals {
    public static void main(String[] args) {
        SingleLevelInheritance tom = new SingleLevelInheritance();

        tom.speak();  // I'm an animal
        tom.speak2(); // I'm an animal
    }
}

class Animals {
    public void speak() {
        System.out.println("I'm an animal");
    }

    public void speak2() {
        System.out.println("I'm an animal");
    }
}
