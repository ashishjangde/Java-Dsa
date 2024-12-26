package practice;

import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Marks: ");
        float marks = sc.nextFloat();
        if (marks > 50) {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
