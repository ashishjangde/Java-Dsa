package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        System.out.println(mo.add(5, 10));          // Output: 15
        System.out.println(mo.add(3.5, 2.5));      // Output: 6.0
        System.out.println(mo.add(1, 2, 3));       // Output: 6
    }

    // Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
