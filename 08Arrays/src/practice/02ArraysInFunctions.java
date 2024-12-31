package practice;

class ArraysInFunctions {
    // Method to update each element of the array by adding 1
    public static void updateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1; // Increment each element by 1
        }
    }

    // Method to update the value of an integer using call by reference
    public static void updateValue(int[] value) {
        value[0] = value[0] + 1; // Increment the value by 1
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Initialize the array
        updateArray(arr); // Call the method to update the array

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] value = {10}; // Initialize the value
        updateValue(value); // Call the method to update the value

        // Print the updated value
        System.out.println(value[0]);
    }
}
