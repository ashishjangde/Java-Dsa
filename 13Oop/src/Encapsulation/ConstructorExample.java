package Encapsulation;

import java.util.Arrays;

public class ConstructorExample {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("John", 101);

        // Initialize marks for student1
        student1.marks[0] = 85;
        student1.marks[1] = 90;
        student1.marks[2] = 95;

        // Create shallow copy
        StudentClass student2 = new StudentClass(student1, false);

        // Create deep copy
        StudentClass student3 = new StudentClass(student1, true);

        // Modify original array (student1.marks)
        student1.marks[0] = 100;

        // Display shallow copy
        System.out.println("Shallow Copy Demo:");
        for (int mark : student2.marks) {
            System.out.println(mark); // Will show modified values from student1
        }

        // Display deep copy
        System.out.println("\nDeep Copy Demo:");
        for (int mark : student3.marks) {
            System.out.println(mark); // Will show original values from student1 (not modified)
        }
    }
}

class StudentClass {
    String name;
    int rollNumber;
    int[] marks;

    // Original constructor  + constructor overloading
    public StudentClass(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[3];
    }
    public StudentClass(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public StudentClass() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.marks = new int[3];
    }


    // Copy constructor with deep or shallow copy option
    public StudentClass(StudentClass student, boolean isDeepCopy) {
        this.name = student.name;
        this.rollNumber = student.rollNumber;

        if (isDeepCopy) {
            // Deep copy: create a new array and copy elements
            this.marks = Arrays.copyOf(student.marks, student.marks.length);
        } else {
            // Shallow copy: copy the reference to the original array
            this.marks = student.marks;
        }
    }
}
