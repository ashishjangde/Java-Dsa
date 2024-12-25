package practice;

public class ImplicitTypeConversion {
    public static void main(String[] args) {
        int a = 40 ;     // -> a is int
        long b = a;      // b is long
        System.out.println(b);  // automatically type promotion to long  this  known as Implicit type conversion
    }
}
