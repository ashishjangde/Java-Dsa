package practice;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        double result;


        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            case '%':
                result = num1 % num2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /, or %.");
        }

        sc.close();
    }
}
