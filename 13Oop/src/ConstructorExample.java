import java.util.Arrays;

public class ConstructorExample {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Red", 20, "Parker");

        // Initialize marks for pen1
        pen1.marks[0] = 10;
        pen1.marks[1] = 20;
        pen1.marks[2] = 30;

        // Create shallow copy
        Pen pen2 = new Pen(pen1, false);

        // Create deep copy
        Pen pen3 = new Pen(pen1, true);

        // Modify original array (pen1.marks)
        pen1.marks[0] = 100;

        // Display shallow copy
        System.out.println("Shallow Copy Demo:");
        for (int mark : pen2.marks) {
            System.out.println(mark); // Will show modified values from pen1
        }

        // Display deep copy
        System.out.println("\nDeep Copy Demo:");
        for (int mark : pen3.marks) {
            System.out.println(mark); // Will show original values from pen1 (not modified)
        }
    }
}

class Pen {
    String color;
    int price;
    String brand;
    int[] marks;

    // Original constructor
    public Pen(String color, int price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.marks = new int[3];
    }

    // Copy constructor with deep or shallow copy option
    public Pen(Pen pen, boolean isDeepCopy) {
        this.color = pen.color;
        this.price = pen.price;
        this.brand = pen.brand;

        if (isDeepCopy) {
            // Deep copy: create a new array and copy elements
            this.marks = Arrays.copyOf(pen.marks, pen.marks.length);
        } else {
            // Shallow copy: copy the reference to the original array
            this.marks = pen.marks;
        }
    }
}
