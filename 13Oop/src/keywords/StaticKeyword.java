package keywords;

public class StaticKeyword {
    // Static variable
    static int count = 0;

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }

    // Instance method
    void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();

        obj1.incrementCount();
        obj2.incrementCount();

        // Call static method without creating an instance
        StaticKeyword.displayCount(); // Output: Count: 2
    }
}
