package practice;

import java.util.Scanner;

class ReverseTheGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int number = sc.nextInt();
        int reverse = 0;
        for(int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
        sc.close();
    }
}
