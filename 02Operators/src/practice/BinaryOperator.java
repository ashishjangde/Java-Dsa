package practice;

public class BinaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Perform addition and print the result
        int c = a + b; // Adds a and b
        System.out.println(c); // Output: 30

        // Perform subtraction and print the result
        int d = b - a; // Subtracts a from b
        System.out.println(d); // Output: 10

        // Perform multiplication and print the result
        int e = a * b; // Multiplies a and b
        System.out.println(e); // Output: 200

        // Perform division and print the result
        int f = a / b; // Divides a by b (integer division)
        System.out.println(f); // Output: 0

        // Perform modulo operation and print the result
        int g = a % b; // Finds the remainder when a is divided by b
        System.out.println(g); // Output: 10 (remainder is the value of a)
    }
}
