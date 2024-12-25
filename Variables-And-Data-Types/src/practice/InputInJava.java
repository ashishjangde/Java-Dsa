package practice;
import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        int sum = num + num2;
        System.out.println("The sum is: " + sum);
    }
}
