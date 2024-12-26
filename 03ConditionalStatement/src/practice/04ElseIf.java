package practice;

import java.util.Scanner; // Import the Scanner class for input

class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            // If marks are 90 or above
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            // If marks are between 80 and 89
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            // If marks are between 70 and 79
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            // If marks are between 60 and 69
            System.out.println("Grade: D");
        } else {
            // If marks are below 60
            System.out.println("Grade: F");
        }

    }
}
