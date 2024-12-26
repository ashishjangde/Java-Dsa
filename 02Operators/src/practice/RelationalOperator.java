package practice;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // Check for equality
        System.out.println(a == b); // Output: false (a is not equal to b)

        // Check for inequality
        System.out.println(a != b); // Output: true (a is not equal to b)

        // Check if a is greater than b
        System.out.println(a > b); // Output: false (a is less than b)

        // Check if a is less than b
        System.out.println(a < b); // Output: true (a is less than b)

        // Check if a is less than or equal to b
        System.out.println(a <= b); // Output: true (a is less than or equal to b)

        // Check if a is greater than or equal to b
        System.out.println(a >= b); // Output: false (a is less than b)
    }
}
