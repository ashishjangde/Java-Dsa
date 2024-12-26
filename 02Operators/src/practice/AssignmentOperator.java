package practice;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: " + a); // Output: 10

        // Add and assign
        a += 5; // Equivalent to a = a + 5
        System.out.println("After a += 5: " + a); // Output: 15

        // Subtract and assign
        a -= 3; // Equivalent to a = a - 3
        System.out.println("After a -= 3: " + a); // Output: 12

        // Multiply and assign
        a *= 2; // Equivalent to a = a * 2
        System.out.println("After a *= 2: " + a); // Output: 24

        // Divide and assign
        a /= 4; // Equivalent to a = a / 4
        System.out.println("After a /= 4: " + a); // Output: 6

        // Modulo and assign
        a %= 5; // Equivalent to a = a % 5
        System.out.println("After a %= 5: " + a); // Output: 1
    }
}
