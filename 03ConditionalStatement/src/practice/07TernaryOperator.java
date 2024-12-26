package practice;

import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        // Using ternary operator to check if number is positive or negative
        String result = (number > 0) ? "Positive" : "Negative";

        System.out.println("The number is " + result);
    }
}
