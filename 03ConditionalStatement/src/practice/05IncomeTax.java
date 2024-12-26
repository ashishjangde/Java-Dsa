package practice;

import java.util.Scanner;

class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax = 0;
        double cess = 0;

        if (income <= 300000) {
            // No tax for income up to ₹3,00,000
            tax = 0;
            System.out.println("No tax for income below or equal to ₹3,00,000.");
        } else if (income <= 700000) {
            // 5% tax for income between ₹3,00,001 and ₹7,00,000
            tax = (income - 300000) * 0.05;
            System.out.println("Tax rate: 5%");
        } else if (income <= 1000000) {
            // 10% tax for income between ₹7,00,001 and ₹10,00,000
            tax = (income - 700000) * 0.10 + (400000 * 0.05); // Add tax from lower brackets
            System.out.println("Tax rate: 10%");
        } else if (income <= 1200000) {
            // 15% tax for income between ₹10,00,001 and ₹12,00,000
            tax = (income - 1000000) * 0.15 + (300000 * 0.10) + (400000 * 0.05); // Add tax from lower brackets
            System.out.println("Tax rate: 15%");
        } else if (income <= 1500000) {
            // 20% tax for income between ₹12,00,001 and ₹15,00,000
            tax = (income - 1200000) * 0.20 + (200000 * 0.15) + (300000 * 0.10) + (400000 * 0.05); // Add tax from lower brackets
            System.out.println("Tax rate: 20%");
        } else {
            // 30% tax for income above ₹15,00,000
            tax = (income - 1500000) * 0.30 + (300000 * 0.20) + (200000 * 0.15) + (300000 * 0.10) + (400000 * 0.05); // Add tax from all lower brackets
            System.out.println("Tax rate: 30%");
        }

        // Adding 4% Health and Education Cess
        cess = tax * 0.04;
        double totalTax = tax + cess;

        System.out.printf("Your total tax is: ₹%.2f%n", totalTax);
        System.out.printf("Including Health and Education Cess: ₹%.2f%n", cess);

        sc.close(); // Close the scanner
    }
}
