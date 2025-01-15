package abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();
        audi.stop();
        audi.innerMethod();
    }
}

interface Car {
    void start();
    void stop();
}

interface InnerInterface {
    void innerMethod();
}

class Audi implements Car, InnerInterface {
    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }

    @Override
    public void innerMethod() {
        System.out.println("Audi inner method");
    }
}
