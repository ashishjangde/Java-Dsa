package practice;

class FunctionOverloading {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static void main(String[] args) {
        // Calling the add method with two integers
        int sum1 = add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum1);

        // Calling the add method with two double values
        double sum2 = add(5.5, 10.5);
        System.out.println("Sum of 5.5 and 10.5 is: " + sum2);

        // Calling the add method with three integers
        int sum3 = add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3 is: " + sum3);
    }
}