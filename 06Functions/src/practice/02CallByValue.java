package practice;

class CallByValue {

    // This method attempts to swap the values of a and b
    public static void swap(int a, int b) {
        // Store the value of a in a temporary variable
        int temp = a;
        // Assign the value of b to a
        a = b;
        // Assign the value of temp (original value of a) to b
        b = temp;
        // Note: This swap only affects the local copies of a and b
    }

    public static void main(String[] args) {
        // Initialize two integer variables
        int a = 10;
        int b = 20;
        // Call the swap method with a and b as arguments
        swap(a, b);
        // Print the values of a and b after the swap attempt
        // The values will remain unchanged because Java uses call by value
        System.out.println("a: " + a + " b: " + b);
    }
    
}

