package practice;

import java.util.Scanner;

class StudentIsPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks from the user
        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        // Use ternary operator to check if the student has passed or failed
        String result = (marks >= 35) ? "Pass" : "Fail";

        // Output the result
        System.out.println("The student has " + result);

        sc.close();
    }
}
