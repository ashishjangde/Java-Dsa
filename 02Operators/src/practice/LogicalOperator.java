package practice;

public class LogicalOperator {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean x = true;
        boolean y = false;

        // Logical AND (&&) - Returns true if both operands are true
        System.out.println(x && y); // Output: false (one operand is false)

        // Logical OR (||) - Returns true if at least one operand is true
        System.out.println(x || y); // Output: true (x is true)

        // Logical NOT (!) - Reverses the value of the operand
        System.out.println(!x); // Output: false (negation of true)
        System.out.println(!y); // Output: true (negation of false)
    }
}
